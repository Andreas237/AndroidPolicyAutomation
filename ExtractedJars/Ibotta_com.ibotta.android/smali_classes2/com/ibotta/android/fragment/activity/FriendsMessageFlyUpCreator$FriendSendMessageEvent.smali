.class public Lcom/ibotta/android/fragment/activity/FriendsMessageFlyUpCreator$FriendSendMessageEvent;
.super Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageEvent;
.source "FriendsMessageFlyUpCreator.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/fragment/activity/FriendsMessageFlyUpCreator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "FriendSendMessageEvent"
.end annotation


# instance fields
.field private message:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 212
    invoke-direct {p0}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageEvent;-><init>()V

    .line 213
    iput-object p1, p0, Lcom/ibotta/android/fragment/activity/FriendsMessageFlyUpCreator$FriendSendMessageEvent;->message:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getMessage()Ljava/lang/String;
    .locals 1

    .line 217
    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/FriendsMessageFlyUpCreator$FriendSendMessageEvent;->message:Ljava/lang/String;

    return-object v0
.end method
