.class public Lcom/ibotta/android/permissions/RuleSet;
.super Ljava/lang/Object;
.source "RuleSet.java"


# instance fields
.field private copy:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/ibotta/android/permissions/Copy;",
            ">;"
        }
    .end annotation
.end field

.field private rules:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/android/permissions/Rule;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/permissions/RuleSet;->rules:Ljava/util/List;

    .line 13
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/permissions/RuleSet;->copy:Ljava/util/Map;

    return-void
.end method

.method public static getCopy(Lcom/ibotta/android/permissions/RuleSet;Lcom/ibotta/android/permissions/Rule;)Lcom/ibotta/android/permissions/Copy;
    .locals 0

    if-eqz p0, :cond_1

    if-nez p1, :cond_0

    goto :goto_0

    .line 36
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/permissions/RuleSet;->getCopy()Ljava/util/Map;

    move-result-object p0

    invoke-virtual {p1}, Lcom/ibotta/android/permissions/Rule;->getCopyKey()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/permissions/Copy;

    return-object p0

    :cond_1
    :goto_0
    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public getCopy()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/ibotta/android/permissions/Copy;",
            ">;"
        }
    .end annotation

    .line 24
    iget-object v0, p0, Lcom/ibotta/android/permissions/RuleSet;->copy:Ljava/util/Map;

    return-object v0
.end method

.method public getRules()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/android/permissions/Rule;",
            ">;"
        }
    .end annotation

    .line 16
    iget-object v0, p0, Lcom/ibotta/android/permissions/RuleSet;->rules:Ljava/util/List;

    return-object v0
.end method

.method public setCopy(Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/ibotta/android/permissions/Copy;",
            ">;)V"
        }
    .end annotation

    .line 28
    iput-object p1, p0, Lcom/ibotta/android/permissions/RuleSet;->copy:Ljava/util/Map;

    return-void
.end method

.method public setRules(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/permissions/Rule;",
            ">;)V"
        }
    .end annotation

    .line 20
    iput-object p1, p0, Lcom/ibotta/android/permissions/RuleSet;->rules:Ljava/util/List;

    return-void
.end method
