.class public Lcom/ibotta/android/permissions/Rule;
.super Ljava/lang/Object;
.source "Rule.java"


# instance fields
.field private area:Ljava/lang/String;

.field private copyKey:Ljava/lang/String;

.field private sessions:Ljava/lang/Short;

.field private time:Ljava/lang/Long;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getArea()Ljava/lang/String;
    .locals 1

    .line 17
    iget-object v0, p0, Lcom/ibotta/android/permissions/Rule;->area:Ljava/lang/String;

    return-object v0
.end method

.method public getAreaEnum()Lcom/ibotta/android/state/app/permissions/Area;
    .locals 1

    .line 25
    iget-object v0, p0, Lcom/ibotta/android/permissions/Rule;->area:Ljava/lang/String;

    invoke-static {v0}, Lcom/ibotta/android/state/app/permissions/Area;->fromString(Ljava/lang/String;)Lcom/ibotta/android/state/app/permissions/Area;

    move-result-object v0

    return-object v0
.end method

.method public getCopyKey()Ljava/lang/String;
    .locals 1

    .line 45
    iget-object v0, p0, Lcom/ibotta/android/permissions/Rule;->copyKey:Ljava/lang/String;

    return-object v0
.end method

.method public getSessions()Ljava/lang/Short;
    .locals 1

    .line 29
    iget-object v0, p0, Lcom/ibotta/android/permissions/Rule;->sessions:Ljava/lang/Short;

    return-object v0
.end method

.method public getTime()Ljava/lang/Long;
    .locals 1

    .line 37
    iget-object v0, p0, Lcom/ibotta/android/permissions/Rule;->time:Ljava/lang/Long;

    return-object v0
.end method

.method public setArea(Ljava/lang/String;)V
    .locals 0

    .line 21
    iput-object p1, p0, Lcom/ibotta/android/permissions/Rule;->area:Ljava/lang/String;

    return-void
.end method

.method public setCopyKey(Ljava/lang/String;)V
    .locals 0

    .line 49
    iput-object p1, p0, Lcom/ibotta/android/permissions/Rule;->copyKey:Ljava/lang/String;

    return-void
.end method

.method public setSessions(Ljava/lang/Short;)V
    .locals 0

    .line 33
    iput-object p1, p0, Lcom/ibotta/android/permissions/Rule;->sessions:Ljava/lang/Short;

    return-void
.end method

.method public setTime(Ljava/lang/Long;)V
    .locals 0

    .line 41
    iput-object p1, p0, Lcom/ibotta/android/permissions/Rule;->time:Ljava/lang/Long;

    return-void
.end method
