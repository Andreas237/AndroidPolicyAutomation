.class public Lcom/ibotta/android/state/app/config/blacklist/BlacklistRuleSet;
.super Ljava/lang/Object;
.source "BlacklistRuleSet.java"


# instance fields
.field private blacklistRules:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/android/state/app/config/blacklist/BlacklistRule;",
            ">;"
        }
    .end annotation
.end field

.field private name:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/state/app/config/blacklist/BlacklistRuleSet;->blacklistRules:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public getBlacklistRules()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/android/state/app/config/blacklist/BlacklistRule;",
            ">;"
        }
    .end annotation

    .line 23
    iget-object v0, p0, Lcom/ibotta/android/state/app/config/blacklist/BlacklistRuleSet;->blacklistRules:Ljava/util/List;

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 15
    iget-object v0, p0, Lcom/ibotta/android/state/app/config/blacklist/BlacklistRuleSet;->name:Ljava/lang/String;

    return-object v0
.end method

.method public setBlacklistRules(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/state/app/config/blacklist/BlacklistRule;",
            ">;)V"
        }
    .end annotation

    .line 27
    iput-object p1, p0, Lcom/ibotta/android/state/app/config/blacklist/BlacklistRuleSet;->blacklistRules:Ljava/util/List;

    return-void
.end method

.method public setName(Ljava/lang/String;)V
    .locals 0

    .line 19
    iput-object p1, p0, Lcom/ibotta/android/state/app/config/blacklist/BlacklistRuleSet;->name:Ljava/lang/String;

    return-void
.end method
