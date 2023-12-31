# [Platinum V] 가장 긴 증가하는 부분 수열 5 - 14003 

##  문제 접근
알고리즘 분류 : 이분 탐색

이분 탐색의 전제 조건은 정렬이 되어있어야 한다.

그렇다면 값을 다 받아두고 정렬을 하여서 가장 긴 걸 찾는다면
N^2의 시간복잡도를 가지기에 이렇게 풀면 안 된다.



그렇다면 값이 입력받을 때 마다 정렬이 유지되는
자료구조를 만들어내면 된다.
결국 사이즈와 역을 찾으면 되기에
그 자료 구조 안에 정답인 값이 유지될 필요는 없다.


## 로직

"새롭게 입력되는 값이 기존 값 보다 크다면 추가"

"그렇지 않을 경우 이분 탐색을 통한 적절한 위치 파악 및
해당 자료의 인덱스 값을 덮어 씌운다
그리고 그 인덱스 값을 저장하는 배열에 넣는다.
"

따로 이분탐색에 대한 메소드 정의를 안 하고
기존의 프레임워크를 활용하여서
풀이(binarySearch)

[문제 링크](https://www.acmicpc.net/problem/14003) 

### 성능 요약

메모리: 225644 KB, 시간: 1048 ms

### 분류

이분 탐색, 가장 긴 증가하는 부분 수열: O(n log n)

### 제출 일자

2023년 12월 13일 12:50:57

### 문제 설명

<p>수열 A가 주어졌을 때, 가장 긴 증가하는 부분 수열을 구하는 프로그램을 작성하시오.</p>

<p>예를 들어, 수열 A = {10, 20, 10, 30, 20, 50} 인 경우에 가장 긴 증가하는 부분 수열은 A = {<strong>10</strong>, <strong>20</strong>, 10, <strong>30</strong>, 20, <strong>50</strong>} 이고, 길이는 4이다.</p>

### 입력 

 <p>첫째 줄에 수열 A의 크기 N (1 ≤ N ≤ 1,000,000)이 주어진다.</p>

<p>둘째 줄에는 수열 A를 이루고 있는 A<sub>i</sub>가 주어진다. (-1,000,000,000 ≤ A<sub>i</sub> ≤ 1,000,000,000)</p>

### 출력 

 <p>첫째 줄에 수열 A의 가장 긴 증가하는 부분 수열의 길이를 출력한다.</p>

<p>둘째 줄에는 정답이 될 수 있는 가장 긴 증가하는 부분 수열을 출력한다.</p>

