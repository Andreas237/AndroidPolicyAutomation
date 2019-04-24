.class public Lcom/ibotta/android/state/app/config/blacklist/BlacklistConfig;
.super Ljava/lang/Object;
.source "BlacklistConfig.java"


# static fields
.field public static final DEFAULT:Lcom/ibotta/android/state/app/config/blacklist/BlacklistConfig;


# instance fields
.field private blacklistRuleSets:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/android/state/app/config/blacklist/BlacklistRuleSet;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 11
    new-instance v0, Lcom/ibotta/android/state/app/config/blacklist/BlacklistConfig;

    invoke-direct {v0}, Lcom/ibotta/android/state/app/config/blacklist/BlacklistConfig;-><init>()V

    sput-object v0, Lcom/ibotta/android/state/app/config/blacklist/BlacklistConfig;->DEFAULT:Lcom/ibotta/android/state/app/config/blacklist/BlacklistConfig;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/state/app/config/blacklist/BlacklistConfig;->blacklistRuleSets:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public getBlacklistRuleSets()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/android/state/app/config/blacklist/BlacklistRuleSet;",
            ">;"
        }
    .end annotation

    .line 16
    iget-object v0, p0, Lcom/ibotta/android/state/app/config/blacklist/BlacklistConfig;->blacklistRuleSets:Ljava/util/List;

    return-object v0
.end method

.method public setBlacklistRuleSets(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/state/app/config/blacklist/BlacklistRuleSet;",
            ">;)V"
        }
    .end annotation

    .line 20
    iput-object p1, p0, Lcom/ibotta/android/state/app/config/blacklist/BlacklistConfig;->blacklistRuleSets:Ljava/util/List;

    return-void
.end method
