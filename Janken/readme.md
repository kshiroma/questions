## じゃんけんの勝敗を決めるアルゴリズム
### 概要
- 当ソースコードはクイズ形式になっています。
- judge(x:Int,y:Int)メソッドを修正して、じゃんけんの勝敗結果を正しく出力されるようにしてください。
```text
あなた グー   , CPU グー   ; あいこ
あなた グー   , CPU チョキ ; あなたの勝ち
あなた グー   , CPU パー   ; あなたの負け
あなた チョキ , CPU グー   ; あなたの負け
あなた チョキ , CPU チョキ ; あいこ
あなた チョキ , CPU パー   ; あなたの勝ち
あなた パー   , CPU グー   ; あなたの勝ち
あなた パー   , CPU チョキ ; あなたの負け
あなた パー   , CPU パー   ; あいこ
```  
### 使い方
#### 事前準備
- jdk(1.8)をインストール
- maven(3.0以上)をインストール
#### コンパイル
- mvn compile
#### 実行
- mvn exec:java
#### 実行結果の確認
- コンソールに勝敗表が出力されます。 
### 終わりに
- 日経ソフトウェア2014年6月～2015年2月辺りで同様の話題が取り上げられたようです。