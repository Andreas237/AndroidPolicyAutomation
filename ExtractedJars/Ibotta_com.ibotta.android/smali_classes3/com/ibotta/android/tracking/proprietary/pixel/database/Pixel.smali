.class public Lcom/ibotta/android/tracking/proprietary/pixel/database/Pixel;
.super Ljava/lang/Object;
.source "Pixel.java"


# instance fields
.field attempts:S
    .annotation runtime Lcom/j256/ormlite/field/DatabaseField;
    .end annotation
.end field

.field id:I
    .annotation runtime Lcom/j256/ormlite/field/DatabaseField;
        generatedId = true
    .end annotation
.end field

.field url:Ljava/lang/String;
    .annotation runtime Lcom/j256/ormlite/field/DatabaseField;
        canBeNull = false
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public addAttempts(I)V
    .locals 1

    .line 42
    iget-short v0, p0, Lcom/ibotta/android/tracking/proprietary/pixel/database/Pixel;->attempts:S

    add-int/2addr v0, p1

    int-to-short p1, v0

    iput-short p1, p0, Lcom/ibotta/android/tracking/proprietary/pixel/database/Pixel;->attempts:S

    return-void
.end method

.method public getAttempts()S
    .locals 1

    .line 34
    iget-short v0, p0, Lcom/ibotta/android/tracking/proprietary/pixel/database/Pixel;->attempts:S

    return v0
.end method

.method public getId()I
    .locals 1

    .line 18
    iget v0, p0, Lcom/ibotta/android/tracking/proprietary/pixel/database/Pixel;->id:I

    return v0
.end method

.method public getUrl()Ljava/lang/String;
    .locals 1

    .line 26
    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/pixel/database/Pixel;->url:Ljava/lang/String;

    return-object v0
.end method

.method public setAttempts(S)V
    .locals 0

    .line 38
    iput-short p1, p0, Lcom/ibotta/android/tracking/proprietary/pixel/database/Pixel;->attempts:S

    return-void
.end method

.method public setId(I)V
    .locals 0

    .line 22
    iput p1, p0, Lcom/ibotta/android/tracking/proprietary/pixel/database/Pixel;->id:I

    return-void
.end method

.method public setUrl(Ljava/lang/String;)V
    .locals 0

    .line 30
    iput-object p1, p0, Lcom/ibotta/android/tracking/proprietary/pixel/database/Pixel;->url:Ljava/lang/String;

    return-void
.end method
