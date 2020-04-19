package ch1

// hailstoneLength 计算希尔顿序列的长度
func hailstoneLength(n int) int {
	length := 1
	for 1 < n {
		if n%2 > 0 {
			n = 3*n + 1
		} else {
			n = n / 2
		}
		length++
	}
	return length
}
