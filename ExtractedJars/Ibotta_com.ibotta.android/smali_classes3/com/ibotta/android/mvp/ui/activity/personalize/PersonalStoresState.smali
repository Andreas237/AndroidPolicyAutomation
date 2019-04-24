.class public Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresState;
.super Ljava/lang/Object;
.source "PersonalStoresState.java"


# annotations
.annotation runtime Lorg/parceler/Parcel;
.end annotation


# instance fields
.field personalStoreModeStr:Ljava/lang/String;

.field retailerSelections:Ljava/util/LinkedHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedHashMap<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresState;->retailerSelections:Ljava/util/LinkedHashMap;

    const-string v0, ""

    .line 14
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresState;->personalStoreModeStr:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getPersonalStoreModeStr()Ljava/lang/String;
    .locals 1

    .line 26
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresState;->personalStoreModeStr:Ljava/lang/String;

    return-object v0
.end method

.method public getRetailerSelections()Ljava/util/LinkedHashMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/LinkedHashMap<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .line 18
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresState;->retailerSelections:Ljava/util/LinkedHashMap;

    return-object v0
.end method

.method public setPersonalStoreModeStr(Ljava/lang/String;)V
    .locals 0

    .line 30
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresState;->personalStoreModeStr:Ljava/lang/String;

    return-void
.end method

.method public setRetailerSelections(Ljava/util/LinkedHashMap;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/LinkedHashMap<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    .line 22
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresState;->retailerSelections:Ljava/util/LinkedHashMap;

    return-void
.end method
