package com.axiel7.moelist.model

data class AnimeDetails(
    val id: Int,
    val title: String,
    val main_picture: MainPicture,
    val alternative_titles: AlternativeTitles,
    val start_date: String,
    val end_date: String,
    val synopsis: String,
    val mean: Float,
    val rank: Int,
    val popularity: Int,
    val num_list_users: Int,
    val num_scoring_users: Int,
    val nsfw: String,
    val created_at: String,
    val updated_at: String,
    val media_type: String,
    val status: String,
    val genres: List<Genre>,
    val my_list_status: MyListStatus,
    val num_episodes: Int,
    val start_season: StartSeason,
    val broadcast: Broadcast,
    val source: String,
    val average_episode_duration: Int,
    val rating: String,
    val pictures: List<MainPicture>,
    val background: String,
    val related_anime: List<RelatedAnime>,
    //val related_manga: List<RelatedManga>,
    val recommendations: List<Recommendations>,
    val studios: List<Studio>,
    val  statistics: Statistics
)