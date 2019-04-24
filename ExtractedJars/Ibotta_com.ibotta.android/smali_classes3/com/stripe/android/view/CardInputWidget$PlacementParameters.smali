.class Lcom/stripe/android/view/CardInputWidget$PlacementParameters;
.super Ljava/lang/Object;
.source "CardInputWidget.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/view/CardInputWidget;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "PlacementParameters"
.end annotation


# instance fields
.field cardDateSeparation:I

.field cardTouchBufferLimit:I

.field cardWidth:I

.field cvcStartPosition:I

.field cvcWidth:I

.field dateCvcSeparation:I

.field dateRightTouchBufferLimit:I

.field dateStartPosition:I

.field dateWidth:I

.field hiddenCardWidth:I

.field peekCardWidth:I


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 10

    .line 939
    sget-object v0, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    const-string v1, "Touch Buffer Data:\nCardTouchBufferLimit = %d\nDateStartPosition = %d\nDateRightTouchBufferLimit = %d\nCvcStartPosition = %d"

    const/4 v2, 0x4

    new-array v3, v2, [Ljava/lang/Object;

    iget v4, p0, Lcom/stripe/android/view/CardInputWidget$PlacementParameters;->cardTouchBufferLimit:I

    .line 945
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    iget v4, p0, Lcom/stripe/android/view/CardInputWidget$PlacementParameters;->dateStartPosition:I

    .line 946
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v6, 0x1

    aput-object v4, v3, v6

    iget v4, p0, Lcom/stripe/android/view/CardInputWidget$PlacementParameters;->dateRightTouchBufferLimit:I

    .line 947
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v7, 0x2

    aput-object v4, v3, v7

    iget v4, p0, Lcom/stripe/android/view/CardInputWidget$PlacementParameters;->cvcStartPosition:I

    .line 948
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v8, 0x3

    aput-object v4, v3, v8

    .line 939
    invoke-static {v0, v1, v3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 949
    sget-object v1, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    const-string v3, "CardWidth = %d\nHiddenCardWidth = %d\nPeekCardWidth = %d\nCardDateSeparation = %d\nDateWidth = %d\nDateCvcSeparation = %d\nCvcWidth = %d\n"

    const/4 v4, 0x7

    new-array v4, v4, [Ljava/lang/Object;

    iget v9, p0, Lcom/stripe/android/view/CardInputWidget$PlacementParameters;->cardWidth:I

    .line 957
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    aput-object v9, v4, v5

    iget v5, p0, Lcom/stripe/android/view/CardInputWidget$PlacementParameters;->hiddenCardWidth:I

    .line 958
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v4, v6

    iget v5, p0, Lcom/stripe/android/view/CardInputWidget$PlacementParameters;->peekCardWidth:I

    .line 959
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v4, v7

    iget v5, p0, Lcom/stripe/android/view/CardInputWidget$PlacementParameters;->cardDateSeparation:I

    .line 960
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v4, v8

    iget v5, p0, Lcom/stripe/android/view/CardInputWidget$PlacementParameters;->dateWidth:I

    .line 961
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v4, v2

    iget v2, p0, Lcom/stripe/android/view/CardInputWidget$PlacementParameters;->dateCvcSeparation:I

    .line 962
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v5, 0x5

    aput-object v2, v4, v5

    iget v2, p0, Lcom/stripe/android/view/CardInputWidget$PlacementParameters;->cvcWidth:I

    .line 963
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v5, 0x6

    aput-object v2, v4, v5

    .line 949
    invoke-static {v1, v3, v4}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 964
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
