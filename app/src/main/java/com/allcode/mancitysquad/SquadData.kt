package com.allcode.mancitysquad

object SquadData {
    private var data = arrayOf(
        arrayOf(
            "Ederson Moraes",
            "https://www.mancity.com/meta/media/gfxd5kgx/04_ederson_half-body.png?width=247",
            "Kiper Brasil yang tampil memukau bersama Benfica di musim 2016/17 ini bergabung dengan City pada 1 Juli 2017. Ia menjadi pemain Brasil keempat bersama Fernandinho, Fernando dan Gabriel Jesus, dan adalah salah satu kiper muda paling berprospek di sepak bola.",
        ),
        arrayOf(
            "Kyle Walker",
            "https://www.mancity.com/meta/media/tl0nlorb/11_kyle-walker_half-body.png?width=247",
            "Kyle Walker bergabung dengan City dari Tottenham dengan kontrak lima tahun pada Juli 2017.Ia memilih mengenakan nomor punggung dua yang pernah dikenakan Bacary Sagna dan menjadi rekrutan ketiga City di musim 2017.Walker memulai karirnya di Sheffield United, dan menghabiskan periode singkat di Northampton sebelum kembali ke Bramall Lane dan memukau di beberapa laga terakhir musim 2008-09 untuk the Blades.",

        ),
        arrayOf(
            "Johs Stones",
            "https://www.mancity.com/meta/media/f4fpngel/18_ruben-dias_half-body.png?width=247",
            "John Stones adalah seorang pemain sepak bola berkewarganegaraan Inggris yang bermain untuk klub Manchester City biasa bermain pada posisi bek. Stones memulai karier juniornya di Barnsley kemudian memulai karier seniornya di klub tersebut, sebelum bergabung dengan Everton pada tahun 2013.",
        ),
        arrayOf(
            "Johs Stones",
            "https://www.mancity.com/meta/media/hvgatxfz/10_john-stones_half-body.png?width=247",
            "Ruben dias adalah sepak bola profesional asal Portugal yang bermain sebagai bek tengah untuk klub Liga Premier, Manchester City dan juga tim nasional Portugal. Dias berasal dari akademi remaja Benfica.,"
        ),
        arrayOf(
            "Aymeric Laporte",
            "https://www.mancity.com/meta/media/dc4dlv5w/00_aymeric-laporte_half-body.png?width=247",
            "Aymeric Jean Louis Gérard Alphonse Laporte adalah seorang pemain sepak bola profesional yang bermain sebagai bek tengah untuk klub Liga Utama Inggris, Manchester City dan tim nasional Spanyol.",
        ),
        arrayOf(
            "Jack Grealish",
            "https://www.mancity.com/meta/media/pchbam0g/21_jack-grealish_half-body.png?width=247",
            "Jack Peter Grealish adalah seorang pemain sepak bola profesional asal Inggris yang bermain sebagai pemain sayap atau gelandang serang untuk klub Liga Utama Inggris Manchester City dan tim nasional Inggris.",

        ),
        arrayOf(
           "Kevin De Bruyne",
           "https://www.mancity.com/meta/media/ginhwk3b/03_kdb_half-body.png?width=247",
           "DIkenal sebagai raja assist, Kevin De Bruyne datang ke City dengan reputasi besar, namun hanya dalam satu musim bersama Chelsea, mudah untuk mengerti mengapa klub sangat menginginkannya. De Bruyne bergabung dengan City pada jendala transfer musim panas 2015/16.",
       ),
        arrayOf(
            "Bernardo Silva",
            "https://www.mancity.com/meta/media/ukrle2ca/02_bernardo-silva_half-body.png?width=247",
            "Bernardo Mota Veiga de Carvalho e Silva adalah seorang pemain sepak bola profesional asal Portugal yang bermain untuk tim Inggris Manchester City dan tim nasional Portugal sebagai gelandang",

        ),
        arrayOf(
            "Phil Foden",
            "https://www.mancity.com/meta/media/d53jx5wl/14_phil-foden_half-body.png?width=247",
            "Philip Walter Foden adalah seorang pemain sepak bola profesional asal Inggris yang bermain sebagai gelandang untuk klub Liga Utama Inggris, Manchester City dan tim nasional Inggris",

        ),
        arrayOf(
            "Gabriel Jesus",
            "https://www.mancity.com/meta/media/gzefnmro/07_gabriel-jesus_half-body.png?width=247",
            "Gabriel Jesus digadang sebagai salah satu bakat terbaik di Amerika Selatan.Pemain berusia 19 tahun ini mendarat dari Brasil usai performa tajam di 2016 termasuk sukses Olimpiade dan gelar domestik bersama Palmeiras.",

        ),
        arrayOf(
            "Riyad Mahrez",
            "https://www.mancity.com/meta/media/0p5jc4n5/16_riyad-mahrez_full.png?width=247",
            "Riyad Mahrez pindah dari Midlands ke Manchester ketika dia bergabung dengan Manchester City pada Juli 2018.Pemain berusia 27 tahun itu menandatangani kontrak hingga 2023 setelah menjadi bintang di Leicester City yang memenangkan Liga Primer pada 2016.Dia melakukan hal yang sama di City di musim debutnya, sambil menambahkan medali Piala Carabao, Piala FA dan Community Shield ke koleksinya, dan menyumbangkan 12 gol dan 12 assist di sepanjang musim."
        )

    )

    val listData: ArrayList<Squad>
        get() {
            val list = ArrayList<Squad>()
            for(aData in data){
                val squad = Squad()
                squad.name = aData[0]
                squad.photo = aData[1]
                squad.detail = aData[2]
                list.add(squad)
            }
            return list
        }



}