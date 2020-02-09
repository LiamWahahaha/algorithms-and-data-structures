/**
 * UnionFind/Disjoing Set data structure implementation.
 */

public class UnionFind {
    private int size;
    private int[] trackSize;
    private int[] id;
    private int numComponents;

    public UnionFind(int size) {
        if (size <= 0) {
            throw new IllegalArgumentException("Size <= 0 is not allowed");
        }

        this.size = size;
        numComponents = size;

        trackSize = new int[size];
        id = new int[size];

        for (int index = 0; index < size; index++) {
            id[index] = index;
            trackSize[index] =  1;
        }
    }

    public int find(int p) {
        int root = p;
        while (root != id[root]) {
            root = id[root];
        }

        while (p != root) {
            int next = id[p];
            id[p] = root;
            p = next;
        }

        return root;
    }

    public int recursiveFind(int p) {
        if (p == id[p]) {
            return p;
        }

        return id[p] = find(id[p]);
    }

    public boolean connected(int p, int q) {
        return find(p) == find(q);
    }

    public int componentSize(int p) {
        return trackSize[find(p)];
    }

    public int size() {
        return size;
    }

    public int components() {
        return numComponents;
    }

    public void unify(int p, int q) {
        int root1 = find(p);
        int root2 = find(q);

        if (root1 == root2) {
            return;
        }

        if (trackSize[root1] < trackSize[root2]) {
            trackSize[root2] += trackSize[root1];
            id[root1] = root2;
        } else {
            trackSize[root1] += trackSize[root2];
            id[root2] = root1;
        }

        numComponents--;
    }
}