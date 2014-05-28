#!/usr/local/bin/scala
!#

object Main {
	def main(args: Array[String]) {
		val (no: String, id: String) = (args(0), args(1))
		val item = s"""
		|<item>
		|  <title>«Полкино». Выпуск №$no</title>
		|  <itunes:author>КиноПоиск.ru</itunes:author>
		|  <itunes:subtitle> http://www.kinopoisk.ru/level/58/podcast/$id/</itunes:subtitle>
		|  <itunes:summary> http://www.kinopoisk.ru/level/58/podcast/$id/</itunes:summary>
		|  <enclosure url="http://www.kinopoisk.ru/podcast/$id.mp3" length="87986012" type="audio/mpeg" />
		|  <guid></guid>
		|  <pubDate>Sun, 18 May 2014 10:12:36 +0400</pubDate>
		|  <itunes:duration>45:49</itunes:duration>
		|  <itunes:explicit>no</itunes:explicit>
		|   <itunes:image href="http://kp.cdn.yandex.net/podcast/646.jpg" />
		|  <link>http://www.kinopoisk.ru/level/58/podcast/$id/</link>
		|  <description>&lt;br&gt;&lt;br&gt;&lt;a href='http://www.kinopoisk.ru/level/58/podcast/$id/'&gt;Подробнее...&lt;/a&gt;</description>
		|</item>
		""".stripMargin
		println(item)
	}
}
