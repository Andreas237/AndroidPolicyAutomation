.class public final synthetic Lcom/ibotta/android/fragment/activity/-$$Lambda$FriendsMessageFlyUpCreator$tShcek4QMIJJJeHSPRAvC7wVw44;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lcom/ibotta/android/service/api/job/ApiJobListener;


# instance fields
.field private final synthetic f$0:Ljava/lang/String;

.field private final synthetic f$1:Lcom/ibotta/android/tracking/Tracker;

.field private final synthetic f$2:Lcom/ibotta/android/fragment/activity/FriendsMessageFlyUpCreator$FriendMessageListener;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Lcom/ibotta/android/tracking/Tracker;Lcom/ibotta/android/fragment/activity/FriendsMessageFlyUpCreator$FriendMessageListener;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/fragment/activity/-$$Lambda$FriendsMessageFlyUpCreator$tShcek4QMIJJJeHSPRAvC7wVw44;->f$0:Ljava/lang/String;

    iput-object p2, p0, Lcom/ibotta/android/fragment/activity/-$$Lambda$FriendsMessageFlyUpCreator$tShcek4QMIJJJeHSPRAvC7wVw44;->f$1:Lcom/ibotta/android/tracking/Tracker;

    iput-object p3, p0, Lcom/ibotta/android/fragment/activity/-$$Lambda$FriendsMessageFlyUpCreator$tShcek4QMIJJJeHSPRAvC7wVw44;->f$2:Lcom/ibotta/android/fragment/activity/FriendsMessageFlyUpCreator$FriendMessageListener;

    return-void
.end method


# virtual methods
.method public final onApiJobFinished(Lcom/ibotta/android/service/api/job/ApiJob;)V
    .locals 3

    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/-$$Lambda$FriendsMessageFlyUpCreator$tShcek4QMIJJJeHSPRAvC7wVw44;->f$0:Ljava/lang/String;

    iget-object v1, p0, Lcom/ibotta/android/fragment/activity/-$$Lambda$FriendsMessageFlyUpCreator$tShcek4QMIJJJeHSPRAvC7wVw44;->f$1:Lcom/ibotta/android/tracking/Tracker;

    iget-object v2, p0, Lcom/ibotta/android/fragment/activity/-$$Lambda$FriendsMessageFlyUpCreator$tShcek4QMIJJJeHSPRAvC7wVw44;->f$2:Lcom/ibotta/android/fragment/activity/FriendsMessageFlyUpCreator$FriendMessageListener;

    invoke-static {v0, v1, v2, p1}, Lcom/ibotta/android/fragment/activity/FriendsMessageFlyUpCreator;->lambda$sendFriendMessage$0(Ljava/lang/String;Lcom/ibotta/android/tracking/Tracker;Lcom/ibotta/android/fragment/activity/FriendsMessageFlyUpCreator$FriendMessageListener;Lcom/ibotta/android/service/api/job/ApiJob;)V

    return-void
.end method

.method public synthetic onApiJobLongTask(Lcom/ibotta/android/service/api/job/ApiJob;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/ibotta/android/service/api/job/ApiJobListener$-CC;->$default$onApiJobLongTask(Lcom/ibotta/android/service/api/job/ApiJobListener;Lcom/ibotta/android/service/api/job/ApiJob;)V

    return-void
.end method
