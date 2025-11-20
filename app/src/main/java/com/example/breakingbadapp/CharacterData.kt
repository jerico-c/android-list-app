package com.example.breakingbadapp

import com.example.breakingbadapp.R // Pastikan R di-import

object CharacterData {
    // 1. Data mentah
    private val characterNames = arrayOf(
        "Walter White",
        "Jesse Pinkman",
        "Saul Goodman",
        "Gus Fring",
        "Mike Ehrmantraut",
        "Hank Schrader",
        "Skyler White",
        "Walter White Jr.",
        "Marie Schrader",
        "Tuco Salamanca"
    )

    private val characterOverviews = arrayOf(
        "Chemistry teacher turned drug kingpin.",
        "Walter's former student and partner.",
        "A flamboyant, 'criminal' lawyer.",
        "A major narcotics distributor.",
        "Former police officer, works for Gus.",
        "DEA agent, Walter's brother-in-law.",
        "Walter's wife.",
        "Walter and Skyler's son.",
        "Skyler's sister and Hank's wife.",
        "A sociopathic Mexican drug distributor."
    )

    // --- DATA BARU (PEKERJAAN) ---
    private val characterJobs = arrayOf(
        "High School Chemistry Teacher / Meth Kingpin",
        "Methamphetamine Cook / Distributor",
        "Lawyer (Saul Goodman & Associates)",
        "Restaurateur / Drug Distributor",
        "Head of Corporate Security / Enforcer",
        "DEA Special Agent",
        "Bookkeeper / Car Wash Manager",
        "Student",
        "Radiologic Technologist",
        "Drug Distributor"
    )

    // --- DATA BARU (AFILIASI) ---
    private val characterAffiliations = arrayOf(
        "Gray Matter Technologies (formerly)",
        "Partner of Walter White",
        "Juarez Cartel (formerly) / Self",
        "Los Pollos Hermanos / Madrigal Electromotive",
        "Los Pollos Hermanos / Madrigal Electromotive",
        "Drug Enforcement Administration (DEA)",
        "Beneke Fabricators (formerly) / A1A Car Wash",
        "Louis Corbett High School",
        "Kleinman Radiology Center",
        "Juarez Cartel"
    )

    // Deskripsi panjang (sudah diperbarui sebelumnya)
    private val characterDescriptions = arrayOf(
        "A mild-mannered high school chemistry teacher in Albuquerque, New Mexico. After being diagnosed with inoperable lung cancer, he turns to a life of crime, producing and selling crystallized methamphetamine to secure his family's financial future. His descent from a caring family man to the ruthless drug kingpin 'Heisenberg' is the central focus of the series.",
        "A former student of Walter White, Jesse becomes his partner in the meth trade. He is impulsive, emotional, and often struggles with the moral consequences of their actions. Despite his rebellious exterior, Jesse frequently serves as Walter's moral conscience and displays a deep loyalty to those he cares about.",
        "James 'Jimmy' McGill, known publicly as Saul Goodman, is a charismatic and morally flexible lawyer. He provides legal counsel and money laundering services to Walter and Jesse, navigating them through the criminal underworld with his vast connections, elaborate schemes, and the catchphrase, 'Better Call Saul!'",
        "Gustavo 'Gus' Fring is a Chilean-American restaurant owner and a major drug distributor in the Southwestern United States. He uses his legitimate business, the fast-food chain Los Pollos Hermanos, as a front for his massive drug operation. He is meticulous, calculating, and utterly ruthless.",
        "A former Philadelphia police officer, Mike works as Gus Fring's chief enforcer, investigator, and cleaner. He is pragmatic, professional, and unflappable, handling difficult situations with a quiet, no-nonsense demeanor. He has a deep love for his granddaughter, which motivates many of his actions.",
        "Hank is a boisterous and determined DEA agent, married to Marie Schrader and brother-in-law to Walter White. His relentless pursuit of the mysterious 'Heisenberg' forms a central conflict in the series, as he is unaware for the longest time that the drug lord he's hunting is his own family member.",
        "Walter's wife, Skyler becomes increasingly aware of Walter's secret life. Initially terrified, she finds herself entangled in his criminal activities, eventually helping him launder his money through a car wash business. Her internal conflict and transformation are a major part of the story.",
        "Walter and Skyler's son, who has cerebral palsy, which affects his speech and mobility. He remains largely unaware of his father's criminal empire for most of the series, idolizing his father while simultaneously dealing with the family's unexplained turmoil.",
        "Marie is Skyler's sister and Hank's wife. She works as a radiologic technologist and struggles with kleptomania. She is fiercely loyal to her family, especially Hank, but can be self-centered and oblivious to the larger criminal activities unfolding around her.",
        "A high-ranking, unhinged, and violent drug distributor for the Juarez Cartel. He becomes Walter and Jesse's first major distributor and antagonist. His unpredictable and psychotic behavior provides the first real glimpse into the dangerous world Walter has entered."
    )

    private val characterPhotos = intArrayOf(
        R.drawable.walter_white,
        R.drawable.jesse_pinkman,
        R.drawable.saul_goodman,
        R.drawable.gus_fring,
        R.drawable.mike_ehrmantraut,
        R.drawable.hank_schrader,
        R.drawable.skyler_white,
        R.drawable.walter_jr,
        R.drawable.marie_schrader,
        R.drawable.tuco_salamanca
    )

    private val characterShareLinks = arrayOf(
        "https://breakingbad.fandom.com/wiki/Walter_White",
        "https://breakingbad.fandom.com/wiki/Jesse_Pinkman",
        "https://breakingbad.fandom.com/wiki/Saul_Goodman",
        "https://breakingbad.fandom.com/wiki/Gus_Fring",
        "https://breakingbad.fandom.com/wiki/Mike_Ehrmantraut",
        "https://breakingbad.fandom.com/wiki/Hank_Schrader",
        "https://breakingbad.fandom.com/wiki/Skyler_White",
        "https://breakingbad.fandom.com/wiki/Walter_White_Jr.",
        "https://breakingbad.fandom.com/wiki/Marie_Schrader",
        "https://breakingbad.fandom.com/wiki/Tuco_Salamanca"
    )

    // 2. Fungsi untuk mengambil data sebagai List
    val listData: ArrayList<Character>
        get() {
            val list = arrayListOf<Character>()
            for (i in characterNames.indices) {
                val character = Character(
                    characterNames[i],
                    characterDescriptions[i],
                    characterPhotos[i],
                    characterOverviews[i],
                    characterShareLinks[i],
                    // --- TAMBAHKAN DATA BARU DI SINI ---
                    characterJobs[i],
                    characterAffiliations[i]
                )
                list.add(character)
            }
            return list
        }
}