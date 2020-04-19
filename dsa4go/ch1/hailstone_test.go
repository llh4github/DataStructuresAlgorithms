package ch1

import "testing"

func TestLength(t *testing.T) {
	t.Log(hailstoneLength(42))
	t.Log(hailstoneLength(7))
	t.Log(hailstoneLength(27))
	t.Log(hailstoneLength(1890))
}
