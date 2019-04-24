.class public Lcom/ibotta/android/state/app/config/quests/QuestsConfig;
.super Ljava/lang/Object;
.source "QuestsConfig.java"


# static fields
.field public static final DEFAULT:Lcom/ibotta/android/state/app/config/quests/QuestsConfig;


# instance fields
.field private bonusDetail:Lcom/ibotta/android/state/app/config/quests/QuestHeaderInfo;

.field private cpg:Lcom/ibotta/android/state/app/config/quests/QuestHeaderInfo;

.field private inviteFriends:Lcom/ibotta/android/state/app/config/quests/QuestHeaderInfo;

.field private mcomm:Lcom/ibotta/android/state/app/config/quests/QuestHeaderInfo;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 8
    new-instance v0, Lcom/ibotta/android/state/app/config/quests/QuestsConfig;

    invoke-direct {v0}, Lcom/ibotta/android/state/app/config/quests/QuestsConfig;-><init>()V

    sput-object v0, Lcom/ibotta/android/state/app/config/quests/QuestsConfig;->DEFAULT:Lcom/ibotta/android/state/app/config/quests/QuestsConfig;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getBonusDetail()Lcom/ibotta/android/state/app/config/quests/QuestHeaderInfo;
    .locals 1

    .line 41
    iget-object v0, p0, Lcom/ibotta/android/state/app/config/quests/QuestsConfig;->bonusDetail:Lcom/ibotta/android/state/app/config/quests/QuestHeaderInfo;

    if-nez v0, :cond_0

    .line 42
    new-instance v0, Lcom/ibotta/android/state/app/config/quests/QuestHeaderInfo;

    invoke-direct {v0}, Lcom/ibotta/android/state/app/config/quests/QuestHeaderInfo;-><init>()V

    return-object v0

    :cond_0
    return-object v0
.end method

.method public getCpg()Lcom/ibotta/android/state/app/config/quests/QuestHeaderInfo;
    .locals 1

    .line 30
    iget-object v0, p0, Lcom/ibotta/android/state/app/config/quests/QuestsConfig;->cpg:Lcom/ibotta/android/state/app/config/quests/QuestHeaderInfo;

    if-nez v0, :cond_0

    .line 31
    new-instance v0, Lcom/ibotta/android/state/app/config/quests/QuestHeaderInfo;

    invoke-direct {v0}, Lcom/ibotta/android/state/app/config/quests/QuestHeaderInfo;-><init>()V

    return-object v0

    :cond_0
    return-object v0
.end method

.method public getInviteFriends()Lcom/ibotta/android/state/app/config/quests/QuestHeaderInfo;
    .locals 1

    .line 52
    iget-object v0, p0, Lcom/ibotta/android/state/app/config/quests/QuestsConfig;->inviteFriends:Lcom/ibotta/android/state/app/config/quests/QuestHeaderInfo;

    if-nez v0, :cond_0

    .line 53
    new-instance v0, Lcom/ibotta/android/state/app/config/quests/QuestHeaderInfo;

    invoke-direct {v0}, Lcom/ibotta/android/state/app/config/quests/QuestHeaderInfo;-><init>()V

    return-object v0

    :cond_0
    return-object v0
.end method

.method public getMcomm()Lcom/ibotta/android/state/app/config/quests/QuestHeaderInfo;
    .locals 1

    .line 19
    iget-object v0, p0, Lcom/ibotta/android/state/app/config/quests/QuestsConfig;->mcomm:Lcom/ibotta/android/state/app/config/quests/QuestHeaderInfo;

    if-nez v0, :cond_0

    .line 20
    new-instance v0, Lcom/ibotta/android/state/app/config/quests/QuestHeaderInfo;

    invoke-direct {v0}, Lcom/ibotta/android/state/app/config/quests/QuestHeaderInfo;-><init>()V

    return-object v0

    :cond_0
    return-object v0
.end method

.method public setBonusDetail(Lcom/ibotta/android/state/app/config/quests/QuestHeaderInfo;)V
    .locals 0

    .line 48
    iput-object p1, p0, Lcom/ibotta/android/state/app/config/quests/QuestsConfig;->bonusDetail:Lcom/ibotta/android/state/app/config/quests/QuestHeaderInfo;

    return-void
.end method

.method public setCpg(Lcom/ibotta/android/state/app/config/quests/QuestHeaderInfo;)V
    .locals 0

    .line 37
    iput-object p1, p0, Lcom/ibotta/android/state/app/config/quests/QuestsConfig;->cpg:Lcom/ibotta/android/state/app/config/quests/QuestHeaderInfo;

    return-void
.end method

.method public setInviteFriends(Lcom/ibotta/android/state/app/config/quests/QuestHeaderInfo;)V
    .locals 0

    .line 59
    iput-object p1, p0, Lcom/ibotta/android/state/app/config/quests/QuestsConfig;->inviteFriends:Lcom/ibotta/android/state/app/config/quests/QuestHeaderInfo;

    return-void
.end method

.method public setMcomm(Lcom/ibotta/android/state/app/config/quests/QuestHeaderInfo;)V
    .locals 0

    .line 26
    iput-object p1, p0, Lcom/ibotta/android/state/app/config/quests/QuestsConfig;->mcomm:Lcom/ibotta/android/state/app/config/quests/QuestHeaderInfo;

    return-void
.end method
