#pragma once
#define DEFAULT_CAPACITY 3 // 默认初始容量
typedef int Rank;		   // 秩
// 向量模版类
template <typename T>
class Vector
{
protected:
	// 内部数据规模
	Rank _size;
	// 容量
	int _capacity;
	// 数据区
	T* _ele;
	// 复制数组区间A[lo,hi)
	void copyFrom(T const* A, Rank lo, Rank hi);
	// 扩容
	void expand();
	// 压缩
	void shrink();

	// 扫描交换
	bool bubbule(Rank lo, Rank hi);
	// 冒泡排序
	void bubbleSort(Rank lo, Rank hi);
	// 区间内最大元素
	Rank maxEle(Rank lo, Rank hi);
	// 选择排序
	void selectionSort(Rank lo, Rank hi);
	// 归并算法
	void merge(Rank lo, Rank mi, Rank hi);
	// 归并排序
	void mergeSort(Rank lo, Rank hi);
	// 轴点构造算法
	void parttion(Rank lo, Rank hi);
	// 快速排序
	void quickSort(Rank lo, Rank hi);
	// 堆排序
	void heapSort(Rank lo, Rank hi);

public:
	// 构造函数
	Vector(int c = DEFAULT_CAPACITY, int s = 0, T v = 0)
	{
		_elem = new T[_capacity = c];
		for (_size = 0; _size < s; _elem[_size++] = v);
	}
};
