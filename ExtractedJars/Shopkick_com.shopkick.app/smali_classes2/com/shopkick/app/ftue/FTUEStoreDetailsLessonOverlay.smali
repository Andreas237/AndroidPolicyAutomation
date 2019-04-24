.class public Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;
.super Lcom/shopkick/app/overlays/base/SKOverlay;
.source "FTUEStoreDetailsLessonOverlay.java"


# static fields
.field private static final CLOSE_OVERLAY_DEFAULT_THRESHOLD:I = 0x32

.field private static final CLOSE_OVERLAY_THRESHOLD_FOR_STAGE_2:I = 0x12c

.field private static final COLUMN_COUNT:I = 0x2

.field private static final HOW_TO_SCAN:Ljava/lang/String; = "howtoscan.mp4"

.field private static final HOW_TO_SCAN_IMAGE_URL:Ljava/lang/String; = "http://e5477f65955711758615-03ba61e808036fcb453796a8c5eb40c2.r50.cf1.rackcdn.com/60-AxSH642X2C.jpeg#2x&1_5x"

.field public static final HOW_TO_SCAN_VIDEO_ID:Ljava/lang/String; = "39650790025"

.field private static final HOW_TO_WALKIN:Ljava/lang/String; = "howtowalkin.mp4"

.field private static final HOW_TO_WALKIN_IMAGE_URL:Ljava/lang/String; = "http://e5477f65955711758615-03ba61e808036fcb453796a8c5eb40c2.r50.cf1.rackcdn.com/60-yGwxhHjPZw.png#2x&1_5x"

.field public static final HOW_TO_WALKIN_VIDEO_ID:Ljava/lang/String; = "42477661259"

.field private static final SIXTY_PERCENT_TRANSPARENCY:I = 0x99

.field private static final STORE_DETAILS_LESSON_COMPLETED_STAGE:I = 0x5

.field private static final STORE_DETAILS_LESSON_INTRO_STAGE:I = 0x1

.field private static final STORE_DETAILS_LESSON_TEXT_REMINDER_STAGE:I = 0x4

.field public static final STORE_DETAILS_LESSON_VIDEOS_COMPLETE_STAGE:I = 0x3

.field public static final STORE_DETAILS_LESSON_WATCH_VIDEOS_STAGE:I = 0x2


# instance fields
.field private animationManager:Lcom/shopkick/app/ftue/FTUEAnimationManager;

.field private animationSetupList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/text/SpannableString;",
            ">;"
        }
    .end annotation
.end field

.field private appPreferences:Lcom/shopkick/app/application/AppPreferences;

.field private chainName:Ljava/lang/String;

.field private context:Landroid/content/Context;

.field private howToScanVideoFile:Ljava/io/File;

.field private howToScanVideoTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

.field private howToWalkinVideoFile:Ljava/io/File;

.field private howToWalkinVideoTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

.field private jeanDialogTv:Lcom/shopkick/app/widget/SKTextView;

.field private jeanDialogTvHidden:Lcom/shopkick/app/widget/SKTextView;

.field private jeanImageView:Lcom/shopkick/app/widget/RoundImageView;

.field private jeanImageViewAnimated:Lcom/shopkick/app/widget/RoundImageView;

.field private logger:Lcom/shopkick/app/application/SKLogger;

.field private mainView:Landroid/view/ViewGroup;

.field private numberOfScans:I

.field private numberOfWalkins:I

.field private overlayBackground:Landroid/view/View;

.field private parentLayout:Lcom/shopkick/app/ftue/DragConstraintLayout;

.field private pauseButton:Landroid/view/View;

.field private recyclerViewAdapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

.field private screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

.field private tapToContinueTv:Lcom/shopkick/app/widget/SKTextView;

.field private userScanCount:I

.field private userWalkinCount:I

.field private videoCarouselRecyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

.field private videoController:Lcom/shopkick/app/video/VideoController;

.field private videoTilesList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 39
    invoke-direct {p0}, Lcom/shopkick/app/overlays/base/SKOverlay;-><init>()V

    .line 90
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->videoTilesList:Ljava/util/List;

    .line 91
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->animationSetupList:Ljava/util/List;

    return-void
.end method

.method private areActionsDone()Z
    .locals 1

    .line 553
    iget v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->userScanCount:I

    if-lez v0, :cond_0

    iget v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->userWalkinCount:I

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private areVideoWatched()Z
    .locals 1

    .line 548
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->appPreferences:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {v0}, Lcom/shopkick/app/application/AppPreferences;->getFtueStoreDetailsScanVideoWatched()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->appPreferences:Lcom/shopkick/app/application/AppPreferences;

    .line 549
    invoke-virtual {v0}, Lcom/shopkick/app/application/AppPreferences;->getFtueStoreDetailsWalkinVideoWatched()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private configureScanVideo(Landroid/content/Context;)V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const v0, 0x7f110316

    .line 240
    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v7

    const-string v0, "howtoscan.mp4"

    .line 241
    invoke-static {p1, v0}, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->getVideoFile(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->howToScanVideoFile:Ljava/io/File;

    const-string v2, "39650790025"

    .line 242
    iget-object p1, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->howToScanVideoFile:Ljava/io/File;

    .line 243
    invoke-direct {p0, p1}, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->getAbsolutePathForFile(Ljava/io/File;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "http://e5477f65955711758615-03ba61e808036fcb453796a8c5eb40c2.r50.cf1.rackcdn.com/60-AxSH642X2C.jpeg#2x&1_5x"

    const/4 v3, 0x1

    const/4 v4, 0x3

    move-object v1, p0

    invoke-direct/range {v1 .. v7}, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->configureTile(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->howToScanVideoTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    return-void
.end method

.method private configureTile(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;
    .locals 2

    .line 275
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;-><init>()V

    const/16 v1, -0x3e7

    .line 276
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    .line 277
    iput-object p1, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->videoId:Ljava/lang/String;

    .line 278
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->kickAmount:Ljava/lang/Integer;

    .line 279
    iput-object p4, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->videoUrl:Ljava/lang/String;

    .line 280
    iput-object p6, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->title:Ljava/lang/String;

    .line 281
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->videoUrlType:Ljava/lang/Integer;

    .line 282
    iput-object p5, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->mainImageUrl:Ljava/lang/String;

    return-object v0
.end method

.method private configureWalkinVideo(Landroid/content/Context;)V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const v0, 0x7f110318

    .line 233
    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v7

    const-string v0, "howtowalkin.mp4"

    .line 234
    invoke-static {p1, v0}, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->getVideoFile(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->howToWalkinVideoFile:Ljava/io/File;

    const-string v2, "42477661259"

    .line 235
    iget-object p1, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->howToWalkinVideoFile:Ljava/io/File;

    invoke-direct {p0, p1}, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->getAbsolutePathForFile(Ljava/io/File;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "http://e5477f65955711758615-03ba61e808036fcb453796a8c5eb40c2.r50.cf1.rackcdn.com/60-yGwxhHjPZw.png#2x&1_5x"

    const/4 v3, 0x1

    const/4 v4, 0x3

    move-object v1, p0

    invoke-direct/range {v1 .. v7}, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->configureTile(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->howToWalkinVideoTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    return-void
.end method

.method private disableClose()V
    .locals 2

    .line 213
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->parentLayout:Lcom/shopkick/app/ftue/DragConstraintLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/shopkick/app/ftue/DragConstraintLayout;->setCloseListener(Lcom/shopkick/app/ftue/DragConstraintLayout$DragConstraintLayoutCloseListener;)V

    .line 214
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->parentLayout:Lcom/shopkick/app/ftue/DragConstraintLayout;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/ftue/DragConstraintLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 215
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->overlayBackground:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 216
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->pauseButton:Landroid/view/View;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method private enableClose()V
    .locals 2

    .line 220
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->parentLayout:Lcom/shopkick/app/ftue/DragConstraintLayout;

    new-instance v1, Lcom/shopkick/app/ftue/-$$Lambda$FTUEStoreDetailsLessonOverlay$dW5i1sm6sH6Y4oNMhrR7VsBineA;

    invoke-direct {v1, p0}, Lcom/shopkick/app/ftue/-$$Lambda$FTUEStoreDetailsLessonOverlay$dW5i1sm6sH6Y4oNMhrR7VsBineA;-><init>(Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;)V

    invoke-virtual {v0, v1}, Lcom/shopkick/app/ftue/DragConstraintLayout;->setCloseListener(Lcom/shopkick/app/ftue/DragConstraintLayout$DragConstraintLayoutCloseListener;)V

    .line 224
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->parentLayout:Lcom/shopkick/app/ftue/DragConstraintLayout;

    new-instance v1, Lcom/shopkick/app/ftue/-$$Lambda$FTUEStoreDetailsLessonOverlay$ko-eQEJG4ThOKqpYPYwO5sNcu8M;

    invoke-direct {v1, p0}, Lcom/shopkick/app/ftue/-$$Lambda$FTUEStoreDetailsLessonOverlay$ko-eQEJG4ThOKqpYPYwO5sNcu8M;-><init>(Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;)V

    invoke-virtual {v0, v1}, Lcom/shopkick/app/ftue/DragConstraintLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 225
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->overlayBackground:Landroid/view/View;

    new-instance v1, Lcom/shopkick/app/ftue/-$$Lambda$FTUEStoreDetailsLessonOverlay$Gf07SObou7O0sCu1lgt31H8v8DI;

    invoke-direct {v1, p0}, Lcom/shopkick/app/ftue/-$$Lambda$FTUEStoreDetailsLessonOverlay$Gf07SObou7O0sCu1lgt31H8v8DI;-><init>(Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 229
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->pauseButton:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method private getAbsolutePathForFile(Ljava/io/File;)Ljava/lang/String;
    .locals 0

    .line 266
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private getSupportedTileTypes()Ljava/util/HashSet;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashSet<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 270
    new-instance v0, Ljava/util/HashSet;

    const/16 v1, -0x3e7

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    return-object v0
.end method

.method private static getVideoFile(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 248
    new-instance v0, Ljava/io/File;

    invoke-virtual {p0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 250
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object p0

    invoke-virtual {p0, p1}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_4

    const/4 p1, 0x0

    .line 251
    :try_start_1
    new-instance v1, Ljava/io/FileOutputStream;

    invoke-direct {v1, v0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    const/16 v2, 0x400

    .line 252
    :try_start_2
    new-array v2, v2, [B

    .line 254
    :goto_0
    invoke-virtual {p0, v2}, Ljava/io/InputStream;->read([B)I

    move-result v3

    if-lez v3, :cond_0

    const/4 v4, 0x0

    .line 255
    invoke-virtual {v1, v2, v4, v3}, Ljava/io/FileOutputStream;->write([BII)V
    :try_end_2
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    .line 257
    :cond_0
    :try_start_3
    invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V
    :try_end_3
    .catch Ljava/lang/Throwable; {:try_start_3 .. :try_end_3} :catch_2
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    if-eqz p0, :cond_1

    .line 258
    :try_start_4
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_4

    :cond_1
    return-object v0

    :catchall_0
    move-exception v0

    move-object v2, p1

    goto :goto_1

    :catch_0
    move-exception v0

    .line 251
    :try_start_5
    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :catchall_1
    move-exception v2

    move-object v5, v2

    move-object v2, v0

    move-object v0, v5

    :goto_1
    if-eqz v2, :cond_2

    .line 257
    :try_start_6
    invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V
    :try_end_6
    .catch Ljava/lang/Throwable; {:try_start_6 .. :try_end_6} :catch_1
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    goto :goto_2

    :catch_1
    move-exception v1

    :try_start_7
    invoke-virtual {v2, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V

    :goto_2
    throw v0
    :try_end_7
    .catch Ljava/lang/Throwable; {:try_start_7 .. :try_end_7} :catch_2
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    :catchall_2
    move-exception v0

    goto :goto_3

    :catch_2
    move-exception p1

    .line 250
    :try_start_8
    throw p1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    :goto_3
    if-eqz p0, :cond_4

    if-eqz p1, :cond_3

    .line 258
    :try_start_9
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_9
    .catch Ljava/lang/Throwable; {:try_start_9 .. :try_end_9} :catch_3
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_4

    goto :goto_4

    :catch_3
    move-exception p0

    :try_start_a
    invoke-virtual {p1, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    goto :goto_4

    :cond_3
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V

    :cond_4
    :goto_4
    throw v0
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_4

    :catch_4
    move-exception p0

    .line 260
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Could not open video file"

    invoke-direct {p1, v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1
.end method

.method private isLessonComplete()Z
    .locals 1

    .line 544
    invoke-direct {p0}, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->areVideoWatched()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-direct {p0}, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->areActionsDone()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-direct {p0}, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->isScanVideoWalkinActionCompleted()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-direct {p0}, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->isWalkinVideoScanActionCompleted()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method private isScanVideoWalkinActionCompleted()Z
    .locals 1

    .line 557
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->appPreferences:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {v0}, Lcom/shopkick/app/application/AppPreferences;->getFtueStoreDetailsScanVideoWatched()Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->userWalkinCount:I

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private isWalkinVideoScanActionCompleted()Z
    .locals 1

    .line 561
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->appPreferences:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {v0}, Lcom/shopkick/app/application/AppPreferences;->getFtueStoreDetailsWalkinVideoWatched()Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->userScanCount:I

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static synthetic lambda$enableClose$97(Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;)V
    .locals 2

    .line 221
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->animationManager:Lcom/shopkick/app/ftue/FTUEAnimationManager;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/shopkick/app/ftue/FTUEAnimationManager;->animateJeanIconToEndPosition(Z)V

    .line 222
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->appPreferences:Lcom/shopkick/app/application/AppPreferences;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/application/AppPreferences;->setFtueStoreDetailsLessonPaused(Z)V

    return-void
.end method

.method public static synthetic lambda$enableClose$98(Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;Landroid/view/View;)V
    .locals 1

    .line 224
    iget-object p1, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->animationManager:Lcom/shopkick/app/ftue/FTUEAnimationManager;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/shopkick/app/ftue/FTUEAnimationManager;->animateJeanIconToEndPosition(Z)V

    return-void
.end method

.method public static synthetic lambda$enableClose$99(Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;Landroid/view/View;)V
    .locals 1

    .line 226
    iget-object p1, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->animationManager:Lcom/shopkick/app/ftue/FTUEAnimationManager;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/shopkick/app/ftue/FTUEAnimationManager;->animateJeanIconToEndPosition(Z)V

    .line 227
    iget-object p1, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->appPreferences:Lcom/shopkick/app/application/AppPreferences;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/shopkick/app/application/AppPreferences;->setFtueStoreDetailsLessonPaused(Z)V

    return-void
.end method

.method public static synthetic lambda$null$100(Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;Landroid/view/View;)V
    .locals 2

    .line 294
    iget-object p1, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->appPreferences:Lcom/shopkick/app/application/AppPreferences;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/shopkick/app/application/AppPreferences;->setFtueStoreDetailsLessonStarted(Z)V

    .line 295
    iget-object p1, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->tapToContinueTv:Lcom/shopkick/app/widget/SKTextView;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Lcom/shopkick/app/widget/SKTextView;->setVisibility(I)V

    .line 296
    iget-object p1, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->jeanDialogTvHidden:Lcom/shopkick/app/widget/SKTextView;

    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->context:Landroid/content/Context;

    const v1, 0x7f11031a

    .line 297
    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 296
    invoke-virtual {p1, v0}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/String;)V

    .line 298
    invoke-direct {p0}, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->setLayoutStage2()V

    .line 299
    invoke-direct {p0}, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->logStoreDetailsLessonTheUserCompletedTheWelcomeStep()V

    return-void
.end method

.method public static synthetic lambda$null$104(Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;Landroid/view/View;)V
    .locals 0

    .line 421
    invoke-direct {p0}, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->disableClose()V

    .line 422
    invoke-direct {p0}, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->isLessonComplete()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 423
    iget-object p1, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->howToScanVideoFile:Ljava/io/File;

    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    .line 424
    iget-object p1, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->howToWalkinVideoFile:Ljava/io/File;

    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    .line 426
    :cond_0
    invoke-direct {p0}, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->setLayoutStage4()V

    .line 427
    invoke-direct {p0}, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->logStoreDetailsLessonTheUserCompletedTheAvailableVideos()V

    .line 428
    invoke-direct {p0}, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->logStoreDetailsLessonDidTheUserCompleteTheLesson()V

    return-void
.end method

.method public static synthetic lambda$null$108(Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;Landroid/view/View;)V
    .locals 1

    .line 487
    invoke-direct {p0}, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->isLessonComplete()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 488
    iget-object p1, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->appPreferences:Lcom/shopkick/app/application/AppPreferences;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/shopkick/app/application/AppPreferences;->setFtueStoreDetailsLessonCompleted(Z)V

    .line 489
    iget-object p1, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->appPreferences:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/application/AppPreferences;->setFtueStoreDetailsLessonPaused(Z)V

    .line 490
    iget-object p1, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->howToScanVideoFile:Ljava/io/File;

    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    .line 491
    iget-object p1, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->howToWalkinVideoFile:Ljava/io/File;

    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    .line 492
    invoke-direct {p0}, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->logStoreDetailsLessonHasTheUserCompletedEarnTabRedirectText()V

    .line 494
    :cond_0
    invoke-virtual {p0}, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->dismiss()V

    return-void
.end method

.method public static synthetic lambda$onOverlayShown$96(Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;)V
    .locals 3

    .line 191
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->animationManager:Lcom/shopkick/app/ftue/FTUEAnimationManager;

    iget-object v1, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->jeanImageViewAnimated:Lcom/shopkick/app/widget/RoundImageView;

    invoke-virtual {v1}, Lcom/shopkick/app/widget/RoundImageView;->getX()F

    move-result v1

    iget-object v2, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->jeanImageView:Lcom/shopkick/app/widget/RoundImageView;

    invoke-virtual {v2}, Lcom/shopkick/app/widget/RoundImageView;->getX()F

    move-result v2

    sub-float/2addr v1, v2

    invoke-virtual {v0, v1}, Lcom/shopkick/app/ftue/FTUEAnimationManager;->setRoundImageViewLeftMargin(F)V

    .line 192
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->animationManager:Lcom/shopkick/app/ftue/FTUEAnimationManager;

    iget-object v1, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->jeanImageViewAnimated:Lcom/shopkick/app/widget/RoundImageView;

    invoke-virtual {v1}, Lcom/shopkick/app/widget/RoundImageView;->getY()F

    move-result v1

    iget-object v2, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->jeanImageView:Lcom/shopkick/app/widget/RoundImageView;

    invoke-virtual {v2}, Lcom/shopkick/app/widget/RoundImageView;->getY()F

    move-result v2

    sub-float/2addr v1, v2

    invoke-virtual {v0, v1}, Lcom/shopkick/app/ftue/FTUEAnimationManager;->setRoundImageViewTopMargin(F)V

    .line 193
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->jeanImageView:Lcom/shopkick/app/widget/RoundImageView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/RoundImageView;->setVisibility(I)V

    .line 194
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->animationManager:Lcom/shopkick/app/ftue/FTUEAnimationManager;

    invoke-virtual {v0}, Lcom/shopkick/app/ftue/FTUEAnimationManager;->animateJeanIconToStartPosition()V

    return-void
.end method

.method public static synthetic lambda$setLayoutStage1$101(Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;)V
    .locals 2

    .line 292
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->tapToContinueTv:Lcom/shopkick/app/widget/SKTextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKTextView;->setVisibility(I)V

    .line 293
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->tapToContinueTv:Lcom/shopkick/app/widget/SKTextView;

    new-instance v1, Lcom/shopkick/app/ftue/-$$Lambda$FTUEStoreDetailsLessonOverlay$3vvR4KOl7ItteW-IRtEz-PGMvmM;

    invoke-direct {v1, p0}, Lcom/shopkick/app/ftue/-$$Lambda$FTUEStoreDetailsLessonOverlay$3vvR4KOl7ItteW-IRtEz-PGMvmM;-><init>(Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;)V

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKTextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public static synthetic lambda$setLayoutStage2$102(Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;)V
    .locals 1

    .line 356
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->videoCarouselRecyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    invoke-static {v0}, Lcom/shopkick/app/ftue/FTUEAnimationManager;->slideInViewEnterAnimation(Landroid/view/View;)V

    return-void
.end method

.method public static synthetic lambda$setLayoutStage3$103(Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;Landroid/view/View;)V
    .locals 0

    .line 406
    invoke-direct {p0}, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->disableClose()V

    .line 407
    invoke-direct {p0}, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->isLessonComplete()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 408
    iget-object p1, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->howToScanVideoFile:Ljava/io/File;

    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    .line 409
    iget-object p1, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->howToWalkinVideoFile:Ljava/io/File;

    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    .line 411
    :cond_0
    invoke-direct {p0}, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->setLayoutStage4()V

    .line 412
    invoke-direct {p0}, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->logStoreDetailsLessonTheUserCompletedTheAvailableVideos()V

    .line 413
    invoke-direct {p0}, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->logStoreDetailsLessonDidTheUserCompleteTheLesson()V

    return-void
.end method

.method public static synthetic lambda$setLayoutStage3$105(Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;)V
    .locals 2

    .line 419
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->tapToContinueTv:Lcom/shopkick/app/widget/SKTextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKTextView;->setVisibility(I)V

    .line 420
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->tapToContinueTv:Lcom/shopkick/app/widget/SKTextView;

    new-instance v1, Lcom/shopkick/app/ftue/-$$Lambda$FTUEStoreDetailsLessonOverlay$gsr3fqDZtz-hu1iB60J_Y08PN70;

    invoke-direct {v1, p0}, Lcom/shopkick/app/ftue/-$$Lambda$FTUEStoreDetailsLessonOverlay$gsr3fqDZtz-hu1iB60J_Y08PN70;-><init>(Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;)V

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKTextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public static synthetic lambda$setLayoutStage4$106(Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;)V
    .locals 2

    .line 462
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->tapToContinueTv:Lcom/shopkick/app/widget/SKTextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKTextView;->setVisibility(I)V

    return-void
.end method

.method public static synthetic lambda$setLayoutStage4$107(Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;Landroid/view/View;)V
    .locals 1

    .line 464
    iget-object p1, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->tapToContinueTv:Lcom/shopkick/app/widget/SKTextView;

    const/4 v0, 0x4

    invoke-virtual {p1, v0}, Lcom/shopkick/app/widget/SKTextView;->setVisibility(I)V

    .line 465
    invoke-direct {p0}, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->setLayoutStage5()V

    .line 466
    invoke-direct {p0}, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->logStoreDetailsLessonHasTheUserCompletedTheReminderStep()V

    return-void
.end method

.method public static synthetic lambda$setLayoutStage5$109(Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;)V
    .locals 2

    .line 485
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->tapToContinueTv:Lcom/shopkick/app/widget/SKTextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKTextView;->setVisibility(I)V

    .line 486
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->tapToContinueTv:Lcom/shopkick/app/widget/SKTextView;

    new-instance v1, Lcom/shopkick/app/ftue/-$$Lambda$FTUEStoreDetailsLessonOverlay$o_v1-0KCACcfPJes_ASq94pYvb8;

    invoke-direct {v1, p0}, Lcom/shopkick/app/ftue/-$$Lambda$FTUEStoreDetailsLessonOverlay$o_v1-0KCACcfPJes_ASq94pYvb8;-><init>(Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;)V

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKTextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method private logStoreDetailsLessonDidTheUserCompleteTheLesson()V
    .locals 2

    .line 440
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v1, 0x6d

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;)V

    .line 441
    iget-object v1, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->logger:Lcom/shopkick/app/application/SKLogger;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->map:Ljava/util/HashMap;

    invoke-virtual {v1, v0}, Lcom/shopkick/app/application/SKLogger;->logPersistentEvent(Ljava/util/Map;)V

    return-void
.end method

.method private logStoreDetailsLessonHasTheUserCompletedEarnTabRedirectText()V
    .locals 2

    .line 514
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v1, 0x6c

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;)V

    .line 515
    iget-object v1, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->logger:Lcom/shopkick/app/application/SKLogger;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->map:Ljava/util/HashMap;

    invoke-virtual {v1, v0}, Lcom/shopkick/app/application/SKLogger;->logPersistentEvent(Ljava/util/Map;)V

    return-void
.end method

.method private logStoreDetailsLessonHasTheUserCompletedTheReminderStep()V
    .locals 2

    .line 471
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v1, 0x6b

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;)V

    .line 472
    iget-object v1, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->logger:Lcom/shopkick/app/application/SKLogger;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->map:Ljava/util/HashMap;

    invoke-virtual {v1, v0}, Lcom/shopkick/app/application/SKLogger;->logPersistentEvent(Ljava/util/Map;)V

    return-void
.end method

.method private logStoreDetailsLessonTheUserCompletedTheAvailableVideos()V
    .locals 2

    .line 435
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v1, 0x6a

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;)V

    .line 436
    iget-object v1, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->logger:Lcom/shopkick/app/application/SKLogger;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->map:Ljava/util/HashMap;

    invoke-virtual {v1, v0}, Lcom/shopkick/app/application/SKLogger;->logPersistentEvent(Ljava/util/Map;)V

    return-void
.end method

.method private logStoreDetailsLessonTheUserCompletedTheWelcomeStep()V
    .locals 2

    .line 305
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v1, 0x67

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;)V

    .line 306
    iget-object v1, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->logger:Lcom/shopkick/app/application/SKLogger;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->map:Ljava/util/HashMap;

    invoke-virtual {v1, v0}, Lcom/shopkick/app/application/SKLogger;->logPersistentEvent(Ljava/util/Map;)V

    return-void
.end method

.method private replaceGradientBackground()V
    .locals 4

    .line 508
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->overlayBackground:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 509
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->parentLayout:Lcom/shopkick/app/ftue/DragConstraintLayout;

    iget-object v2, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->context:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f06010b

    invoke-virtual {v2, v3, v1}, Landroid/content/res/Resources;->getColor(ILandroid/content/res/Resources$Theme;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/ftue/DragConstraintLayout;->setBackgroundColor(I)V

    .line 510
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->parentLayout:Lcom/shopkick/app/ftue/DragConstraintLayout;

    invoke-virtual {v0}, Lcom/shopkick/app/ftue/DragConstraintLayout;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    const/16 v1, 0x99

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    return-void
.end method

.method private resetLayout()V
    .locals 3

    .line 500
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->parentLayout:Lcom/shopkick/app/ftue/DragConstraintLayout;

    const/16 v1, 0x32

    invoke-virtual {v0, v1}, Lcom/shopkick/app/ftue/DragConstraintLayout;->setDraggingCloseThreshold(I)V

    .line 501
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->jeanDialogTv:Lcom/shopkick/app/widget/SKTextView;

    const-string v1, ""

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/String;)V

    .line 502
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->jeanDialogTvHidden:Lcom/shopkick/app/widget/SKTextView;

    const/high16 v1, 0x41900000    # 18.0f

    const/4 v2, 0x2

    invoke-virtual {v0, v2, v1}, Lcom/shopkick/app/widget/SKTextView;->setTextSize(IF)V

    .line 503
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->jeanDialogTv:Lcom/shopkick/app/widget/SKTextView;

    invoke-virtual {v0, v2, v1}, Lcom/shopkick/app/widget/SKTextView;->setTextSize(IF)V

    .line 504
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->tapToContinueTv:Lcom/shopkick/app/widget/SKTextView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKTextView;->setVisibility(I)V

    return-void
.end method

.method private setLayoutStage1()V
    .locals 4

    .line 287
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->appPreferences:Lcom/shopkick/app/application/AppPreferences;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/application/AppPreferences;->setFtueStoreDetailsCurrentStage(I)V

    .line 288
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->context:Landroid/content/Context;

    const v2, 0x7f110314

    invoke-virtual {v0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 289
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->animationSetupList:Ljava/util/List;

    .line 290
    new-instance v2, Landroid/text/SpannableString;

    invoke-direct {v2, v0}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 291
    new-instance v0, Lcom/shopkick/app/ftue/-$$Lambda$FTUEStoreDetailsLessonOverlay$RsS1t4xKJCOae1Zzx9TxLOfgmCg;

    invoke-direct {v0, p0}, Lcom/shopkick/app/ftue/-$$Lambda$FTUEStoreDetailsLessonOverlay$RsS1t4xKJCOae1Zzx9TxLOfgmCg;-><init>(Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;)V

    new-instance v3, Lcom/shopkick/app/ftue/-$$Lambda$1VzER9XCxKOcyOKe1uo6j7T01AQ;

    invoke-direct {v3, p0}, Lcom/shopkick/app/ftue/-$$Lambda$1VzER9XCxKOcyOKe1uo6j7T01AQ;-><init>(Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;)V

    invoke-direct {p0, v2, v0, v3, v1}, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->startAnimationSetup(Landroid/text/SpannableString;Lcom/shopkick/app/ftue/FTUEAnimationManager$FTUEAnimationManagerTextAnimationFinishListener;Lcom/shopkick/app/ftue/FTUEAnimationManager$FTUEAnimationManagerOverlayDismissListener;Z)V

    return-void
.end method

.method private setLayoutStage2()V
    .locals 4

    .line 310
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->appPreferences:Lcom/shopkick/app/application/AppPreferences;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lcom/shopkick/app/application/AppPreferences;->setFtueStoreDetailsCurrentStage(I)V

    .line 311
    invoke-direct {p0}, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->resetLayout()V

    .line 312
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->parentLayout:Lcom/shopkick/app/ftue/DragConstraintLayout;

    const/16 v1, 0x12c

    invoke-virtual {v0, v1}, Lcom/shopkick/app/ftue/DragConstraintLayout;->setDraggingCloseThreshold(I)V

    .line 314
    invoke-direct {p0}, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->replaceGradientBackground()V

    const-string v0, ""

    .line 316
    new-instance v1, Landroid/text/SpannableString;

    invoke-direct {v1, v0}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 317
    iget v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->numberOfScans:I

    const/4 v2, 0x0

    if-lez v0, :cond_1

    iget v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->numberOfWalkins:I

    if-lez v0, :cond_1

    iget v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->userScanCount:I

    if-nez v0, :cond_1

    iget v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->userWalkinCount:I

    if-nez v0, :cond_1

    .line 318
    invoke-direct {p0}, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->shouldDisplayScanVideo()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->shouldDisplayWalkinVideo()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 319
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->videoTilesList:Ljava/util/List;

    iget-object v1, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->howToScanVideoTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 320
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->videoTilesList:Ljava/util/List;

    iget-object v1, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->howToWalkinVideoTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 321
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->jeanDialogTvHidden:Lcom/shopkick/app/widget/SKTextView;

    iget-object v1, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->context:Landroid/content/Context;

    const v3, 0x7f11031a

    .line 322
    invoke-virtual {v1, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 321
    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/String;)V

    .line 323
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->context:Landroid/content/Context;

    invoke-virtual {v0, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 324
    iget-object v1, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->context:Landroid/content/Context;

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-static {v0, v1, v3}, Lcom/shopkick/app/ftue/FTUEAnimationManager;->applyTextCustomization(Ljava/lang/String;Landroid/content/Context;Ljava/lang/Boolean;)Landroid/text/SpannableString;

    move-result-object v1

    goto :goto_0

    .line 326
    :cond_1
    invoke-direct {p0}, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->shouldDisplayScanVideo()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 327
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->videoTilesList:Ljava/util/List;

    iget-object v1, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->howToScanVideoTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 328
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->jeanDialogTvHidden:Lcom/shopkick/app/widget/SKTextView;

    iget-object v1, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->context:Landroid/content/Context;

    const v3, 0x7f110319

    invoke-virtual {v1, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/String;)V

    .line 329
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->context:Landroid/content/Context;

    invoke-virtual {v0, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 330
    iget-object v1, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->context:Landroid/content/Context;

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-static {v0, v1, v3}, Lcom/shopkick/app/ftue/FTUEAnimationManager;->applyTextCustomization(Ljava/lang/String;Landroid/content/Context;Ljava/lang/Boolean;)Landroid/text/SpannableString;

    move-result-object v1

    goto :goto_0

    .line 331
    :cond_2
    invoke-direct {p0}, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->shouldDisplayWalkinVideo()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 332
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->videoTilesList:Ljava/util/List;

    iget-object v1, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->howToWalkinVideoTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 333
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->jeanDialogTvHidden:Lcom/shopkick/app/widget/SKTextView;

    iget-object v1, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->context:Landroid/content/Context;

    const v3, 0x7f11031b

    invoke-virtual {v1, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/String;)V

    .line 334
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->context:Landroid/content/Context;

    invoke-virtual {v0, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 335
    iget-object v1, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->context:Landroid/content/Context;

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-static {v0, v1, v3}, Lcom/shopkick/app/ftue/FTUEAnimationManager;->applyTextCustomization(Ljava/lang/String;Landroid/content/Context;Ljava/lang/Boolean;)Landroid/text/SpannableString;

    move-result-object v1

    .line 338
    :cond_3
    :goto_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->animationSetupList:Ljava/util/List;

    .line 339
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->tapToContinueTv:Lcom/shopkick/app/widget/SKTextView;

    const/16 v3, 0x8

    invoke-virtual {v0, v3}, Lcom/shopkick/app/widget/SKTextView;->setVisibility(I)V

    .line 340
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->videoCarouselRecyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    const/4 v3, 0x4

    invoke-virtual {v0, v3}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->setVisibility(I)V

    .line 341
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->recyclerViewAdapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    iget-object v3, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->videoTilesList:Ljava/util/List;

    invoke-virtual {v0, v3}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->addTiles(Ljava/util/List;)V

    .line 342
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->recyclerViewAdapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    invoke-virtual {v0}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->notifyDataSetChanged()V

    .line 343
    invoke-direct {p0}, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->enableClose()V

    .line 345
    invoke-virtual {v1}, Landroid/text/SpannableString;->length()I

    move-result v0

    if-nez v0, :cond_4

    .line 347
    invoke-direct {p0}, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->setLayoutStage3()V

    goto :goto_1

    .line 349
    :cond_4
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->appPreferences:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {v0}, Lcom/shopkick/app/application/AppPreferences;->getFtueSkipAnimations()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 350
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->jeanDialogTv:Lcom/shopkick/app/widget/SKTextView;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/CharSequence;)V

    const/4 v0, 0x0

    .line 351
    new-instance v3, Lcom/shopkick/app/ftue/-$$Lambda$1VzER9XCxKOcyOKe1uo6j7T01AQ;

    invoke-direct {v3, p0}, Lcom/shopkick/app/ftue/-$$Lambda$1VzER9XCxKOcyOKe1uo6j7T01AQ;-><init>(Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;)V

    invoke-direct {p0, v1, v0, v3, v2}, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->startAnimationSetup(Landroid/text/SpannableString;Lcom/shopkick/app/ftue/FTUEAnimationManager$FTUEAnimationManagerTextAnimationFinishListener;Lcom/shopkick/app/ftue/FTUEAnimationManager$FTUEAnimationManagerOverlayDismissListener;Z)V

    .line 352
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->videoCarouselRecyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    invoke-static {v0}, Lcom/shopkick/app/ftue/FTUEAnimationManager;->slideInViewEnterAnimation(Landroid/view/View;)V

    .line 353
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->appPreferences:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {v0, v2}, Lcom/shopkick/app/application/AppPreferences;->setFtueSkipAnimations(Z)V

    goto :goto_1

    .line 355
    :cond_5
    new-instance v0, Lcom/shopkick/app/ftue/-$$Lambda$FTUEStoreDetailsLessonOverlay$ZC_tC2OYwb0yIGVNu7H6ygGB1bU;

    invoke-direct {v0, p0}, Lcom/shopkick/app/ftue/-$$Lambda$FTUEStoreDetailsLessonOverlay$ZC_tC2OYwb0yIGVNu7H6ygGB1bU;-><init>(Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;)V

    new-instance v2, Lcom/shopkick/app/ftue/-$$Lambda$1VzER9XCxKOcyOKe1uo6j7T01AQ;

    invoke-direct {v2, p0}, Lcom/shopkick/app/ftue/-$$Lambda$1VzER9XCxKOcyOKe1uo6j7T01AQ;-><init>(Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;)V

    const/4 v3, 0x1

    invoke-direct {p0, v1, v0, v2, v3}, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->startAnimationSetup(Landroid/text/SpannableString;Lcom/shopkick/app/ftue/FTUEAnimationManager$FTUEAnimationManagerTextAnimationFinishListener;Lcom/shopkick/app/ftue/FTUEAnimationManager$FTUEAnimationManagerOverlayDismissListener;Z)V

    :goto_1
    return-void
.end method

.method private setLayoutStage3()V
    .locals 4

    .line 363
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->appPreferences:Lcom/shopkick/app/application/AppPreferences;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lcom/shopkick/app/application/AppPreferences;->setFtueStoreDetailsCurrentStage(I)V

    .line 364
    invoke-direct {p0}, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->resetLayout()V

    .line 366
    invoke-direct {p0}, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->replaceGradientBackground()V

    .line 368
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->jeanDialogTvHidden:Lcom/shopkick/app/widget/SKTextView;

    iget-object v1, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->context:Landroid/content/Context;

    const v2, 0x7f110317

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/String;)V

    .line 369
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->jeanDialogTvHidden:Lcom/shopkick/app/widget/SKTextView;

    const/high16 v1, 0x41c00000    # 24.0f

    const/4 v3, 0x2

    invoke-virtual {v0, v3, v1}, Lcom/shopkick/app/widget/SKTextView;->setTextSize(IF)V

    .line 370
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->jeanDialogTv:Lcom/shopkick/app/widget/SKTextView;

    invoke-virtual {v0, v3, v1}, Lcom/shopkick/app/widget/SKTextView;->setTextSize(IF)V

    .line 371
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->context:Landroid/content/Context;

    invoke-virtual {v0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 372
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->animationSetupList:Ljava/util/List;

    .line 373
    new-instance v1, Landroid/text/SpannableString;

    invoke-direct {v1, v0}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 374
    invoke-direct {p0}, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->enableClose()V

    .line 375
    iget v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->numberOfScans:I

    if-lez v0, :cond_2

    iget v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->numberOfWalkins:I

    if-lez v0, :cond_2

    .line 376
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->appPreferences:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {v0}, Lcom/shopkick/app/application/AppPreferences;->getFtueStoreDetailsScanVideoWatched()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->appPreferences:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {v0}, Lcom/shopkick/app/application/AppPreferences;->getFtueStoreDetailsWalkinVideoWatched()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 377
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->videoTilesList:Ljava/util/List;

    iget-object v2, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->howToScanVideoTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 378
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->videoTilesList:Ljava/util/List;

    iget-object v2, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->howToWalkinVideoTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    const-string v0, "42477661259"

    .line 379
    iget-object v2, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->videoController:Lcom/shopkick/app/video/VideoController;

    invoke-virtual {v2}, Lcom/shopkick/app/video/VideoController;->getLastConfiguredVideoId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 380
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->videoTilesList:Ljava/util/List;

    iget-object v2, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->howToWalkinVideoTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    const-string v0, "39650790025"

    .line 381
    iget-object v2, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->videoController:Lcom/shopkick/app/video/VideoController;

    invoke-virtual {v2}, Lcom/shopkick/app/video/VideoController;->getLastConfiguredVideoId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 382
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->videoTilesList:Ljava/util/List;

    iget-object v2, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->howToScanVideoTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 384
    :cond_2
    iget v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->numberOfScans:I

    if-lez v0, :cond_3

    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->appPreferences:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {v0}, Lcom/shopkick/app/application/AppPreferences;->getFtueStoreDetailsScanVideoWatched()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 385
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->videoTilesList:Ljava/util/List;

    iget-object v2, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->howToScanVideoTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 386
    :cond_3
    iget v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->numberOfWalkins:I

    if-lez v0, :cond_4

    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->appPreferences:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {v0}, Lcom/shopkick/app/application/AppPreferences;->getFtueStoreDetailsWalkinVideoWatched()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 387
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->videoTilesList:Ljava/util/List;

    iget-object v2, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->howToWalkinVideoTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 390
    :cond_4
    :goto_0
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->tapToContinueTv:Lcom/shopkick/app/widget/SKTextView;

    const/4 v2, 0x4

    invoke-virtual {v0, v2}, Lcom/shopkick/app/widget/SKTextView;->setVisibility(I)V

    .line 391
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->recyclerViewAdapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    iget-object v2, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->videoTilesList:Ljava/util/List;

    invoke-virtual {v0, v2}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->addTiles(Ljava/util/List;)V

    .line 392
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->recyclerViewAdapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    invoke-virtual {v0}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->notifyDataSetChanged()V

    .line 393
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->videoCarouselRecyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->setVisibility(I)V

    .line 395
    invoke-direct {p0}, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->isLessonComplete()Z

    move-result v0

    const/4 v3, 0x1

    if-eqz v0, :cond_5

    .line 396
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->appPreferences:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {v0, v3}, Lcom/shopkick/app/application/AppPreferences;->setFtueStoreDetailsLessonCompleted(Z)V

    .line 397
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->appPreferences:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {v0, v3}, Lcom/shopkick/app/application/AppPreferences;->setFtueStoreDetailsLessonPaused(Z)V

    .line 398
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->howToScanVideoFile:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 399
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->howToWalkinVideoFile:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 402
    :cond_5
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->appPreferences:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {v0}, Lcom/shopkick/app/application/AppPreferences;->getFtueSkipAnimations()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 403
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->jeanDialogTv:Lcom/shopkick/app/widget/SKTextView;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/CharSequence;)V

    .line 404
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->tapToContinueTv:Lcom/shopkick/app/widget/SKTextView;

    invoke-virtual {v0, v2}, Lcom/shopkick/app/widget/SKTextView;->setVisibility(I)V

    .line 405
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->tapToContinueTv:Lcom/shopkick/app/widget/SKTextView;

    new-instance v3, Lcom/shopkick/app/ftue/-$$Lambda$FTUEStoreDetailsLessonOverlay$UwKDUnJ0nxpXxpz_dJ-6bnktZF0;

    invoke-direct {v3, p0}, Lcom/shopkick/app/ftue/-$$Lambda$FTUEStoreDetailsLessonOverlay$UwKDUnJ0nxpXxpz_dJ-6bnktZF0;-><init>(Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;)V

    invoke-virtual {v0, v3}, Lcom/shopkick/app/widget/SKTextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const/4 v0, 0x0

    .line 415
    new-instance v3, Lcom/shopkick/app/ftue/-$$Lambda$1VzER9XCxKOcyOKe1uo6j7T01AQ;

    invoke-direct {v3, p0}, Lcom/shopkick/app/ftue/-$$Lambda$1VzER9XCxKOcyOKe1uo6j7T01AQ;-><init>(Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;)V

    invoke-direct {p0, v1, v0, v3, v2}, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->startAnimationSetup(Landroid/text/SpannableString;Lcom/shopkick/app/ftue/FTUEAnimationManager$FTUEAnimationManagerTextAnimationFinishListener;Lcom/shopkick/app/ftue/FTUEAnimationManager$FTUEAnimationManagerOverlayDismissListener;Z)V

    .line 416
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->appPreferences:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {v0, v2}, Lcom/shopkick/app/application/AppPreferences;->setFtueSkipAnimations(Z)V

    goto :goto_1

    .line 418
    :cond_6
    new-instance v0, Lcom/shopkick/app/ftue/-$$Lambda$FTUEStoreDetailsLessonOverlay$iG1PSqla4h5iTad-RnjC7XAhR1s;

    invoke-direct {v0, p0}, Lcom/shopkick/app/ftue/-$$Lambda$FTUEStoreDetailsLessonOverlay$iG1PSqla4h5iTad-RnjC7XAhR1s;-><init>(Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;)V

    new-instance v2, Lcom/shopkick/app/ftue/-$$Lambda$1VzER9XCxKOcyOKe1uo6j7T01AQ;

    invoke-direct {v2, p0}, Lcom/shopkick/app/ftue/-$$Lambda$1VzER9XCxKOcyOKe1uo6j7T01AQ;-><init>(Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;)V

    invoke-direct {p0, v1, v0, v2, v3}, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->startAnimationSetup(Landroid/text/SpannableString;Lcom/shopkick/app/ftue/FTUEAnimationManager$FTUEAnimationManagerTextAnimationFinishListener;Lcom/shopkick/app/ftue/FTUEAnimationManager$FTUEAnimationManagerOverlayDismissListener;Z)V

    :goto_1
    return-void
.end method

.method private setLayoutStage4()V
    .locals 4

    .line 445
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->appPreferences:Lcom/shopkick/app/application/AppPreferences;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lcom/shopkick/app/application/AppPreferences;->setFtueStoreDetailsCurrentStage(I)V

    .line 446
    invoke-direct {p0}, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->resetLayout()V

    .line 448
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->overlayBackground:Landroid/view/View;

    .line 449
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/support/constraint/ConstraintLayout$LayoutParams;

    .line 450
    iget-object v1, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->context:Landroid/content/Context;

    .line 451
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    const/4 v2, 0x1

    const/high16 v3, 0x43140000    # 148.0f

    .line 450
    invoke-static {v2, v3, v1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v1

    float-to-int v1, v1

    iput v1, v0, Landroid/support/constraint/ConstraintLayout$LayoutParams;->height:I

    .line 453
    iget-object v1, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->parentLayout:Lcom/shopkick/app/ftue/DragConstraintLayout;

    const/4 v3, 0x0

    invoke-virtual {v1, v3}, Lcom/shopkick/app/ftue/DragConstraintLayout;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 454
    iget-object v1, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->overlayBackground:Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 455
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->overlayBackground:Landroid/view/View;

    iget-object v1, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->context:Landroid/content/Context;

    const v3, 0x7f080173

    invoke-virtual {v1, v3}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 457
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->jeanDialogTvHidden:Lcom/shopkick/app/widget/SKTextView;

    iget-object v1, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->context:Landroid/content/Context;

    const v3, 0x7f110315

    invoke-virtual {v1, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/String;)V

    .line 458
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->context:Landroid/content/Context;

    invoke-virtual {v0, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 459
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->animationSetupList:Ljava/util/List;

    .line 460
    new-instance v1, Landroid/text/SpannableString;

    invoke-direct {v1, v0}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 461
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->videoCarouselRecyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    const/16 v3, 0x8

    invoke-virtual {v0, v3}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->setVisibility(I)V

    .line 462
    new-instance v0, Lcom/shopkick/app/ftue/-$$Lambda$FTUEStoreDetailsLessonOverlay$iAsibEbe5-5mHwe3oFI28Hj4gYE;

    invoke-direct {v0, p0}, Lcom/shopkick/app/ftue/-$$Lambda$FTUEStoreDetailsLessonOverlay$iAsibEbe5-5mHwe3oFI28Hj4gYE;-><init>(Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;)V

    new-instance v3, Lcom/shopkick/app/ftue/-$$Lambda$1VzER9XCxKOcyOKe1uo6j7T01AQ;

    invoke-direct {v3, p0}, Lcom/shopkick/app/ftue/-$$Lambda$1VzER9XCxKOcyOKe1uo6j7T01AQ;-><init>(Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;)V

    invoke-direct {p0, v1, v0, v3, v2}, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->startAnimationSetup(Landroid/text/SpannableString;Lcom/shopkick/app/ftue/FTUEAnimationManager$FTUEAnimationManagerTextAnimationFinishListener;Lcom/shopkick/app/ftue/FTUEAnimationManager$FTUEAnimationManagerOverlayDismissListener;Z)V

    .line 463
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->tapToContinueTv:Lcom/shopkick/app/widget/SKTextView;

    new-instance v1, Lcom/shopkick/app/ftue/-$$Lambda$FTUEStoreDetailsLessonOverlay$GwcJRyf2I1fv-TDhtSA1aOM8m2c;

    invoke-direct {v1, p0}, Lcom/shopkick/app/ftue/-$$Lambda$FTUEStoreDetailsLessonOverlay$GwcJRyf2I1fv-TDhtSA1aOM8m2c;-><init>(Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;)V

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKTextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method private setLayoutStage5()V
    .locals 7

    .line 476
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->appPreferences:Lcom/shopkick/app/application/AppPreferences;

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Lcom/shopkick/app/application/AppPreferences;->setFtueStoreDetailsCurrentStage(I)V

    .line 477
    invoke-direct {p0}, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->resetLayout()V

    .line 478
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->jeanDialogTvHidden:Lcom/shopkick/app/widget/SKTextView;

    iget-object v1, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->context:Landroid/content/Context;

    const v2, 0x7f110313

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v3, 0x1

    new-array v4, v3, [Ljava/lang/Object;

    iget-object v5, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->chainName:Ljava/lang/String;

    const/4 v6, 0x0

    aput-object v5, v4, v6

    invoke-static {v1, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/String;)V

    .line 479
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->context:Landroid/content/Context;

    .line 480
    invoke-virtual {v0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    new-array v1, v3, [Ljava/lang/Object;

    iget-object v2, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->chainName:Ljava/lang/String;

    aput-object v2, v1, v6

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 482
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->animationSetupList:Ljava/util/List;

    .line 483
    new-instance v1, Landroid/text/SpannableString;

    invoke-direct {v1, v0}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 484
    new-instance v0, Lcom/shopkick/app/ftue/-$$Lambda$FTUEStoreDetailsLessonOverlay$W40nqihP1Lt2aNmyKKNzdN3Cqs0;

    invoke-direct {v0, p0}, Lcom/shopkick/app/ftue/-$$Lambda$FTUEStoreDetailsLessonOverlay$W40nqihP1Lt2aNmyKKNzdN3Cqs0;-><init>(Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;)V

    const/4 v2, 0x0

    invoke-direct {p0, v1, v0, v2, v3}, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->startAnimationSetup(Landroid/text/SpannableString;Lcom/shopkick/app/ftue/FTUEAnimationManager$FTUEAnimationManagerTextAnimationFinishListener;Lcom/shopkick/app/ftue/FTUEAnimationManager$FTUEAnimationManagerOverlayDismissListener;Z)V

    return-void
.end method

.method private shouldDisplayScanVideo()Z
    .locals 1

    .line 536
    iget v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->numberOfScans:I

    if-lez v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->appPreferences:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {v0}, Lcom/shopkick/app/application/AppPreferences;->getFtueStoreDetailsScanVideoWatched()Z

    move-result v0

    if-nez v0, :cond_0

    iget v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->userScanCount:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private shouldDisplayWalkinVideo()Z
    .locals 1

    .line 540
    iget v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->numberOfWalkins:I

    if-lez v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->appPreferences:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {v0}, Lcom/shopkick/app/application/AppPreferences;->getFtueStoreDetailsWalkinVideoWatched()Z

    move-result v0

    if-nez v0, :cond_0

    iget v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->userWalkinCount:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private startAnimationSetup(Landroid/text/SpannableString;Lcom/shopkick/app/ftue/FTUEAnimationManager$FTUEAnimationManagerTextAnimationFinishListener;Lcom/shopkick/app/ftue/FTUEAnimationManager$FTUEAnimationManagerOverlayDismissListener;Z)V
    .locals 2

    .line 522
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->animationManager:Lcom/shopkick/app/ftue/FTUEAnimationManager;

    iget-object v1, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->jeanDialogTv:Lcom/shopkick/app/widget/SKTextView;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/ftue/FTUEAnimationManager;->setTextView(Lcom/shopkick/app/widget/SKTextView;)V

    .line 523
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->animationManager:Lcom/shopkick/app/ftue/FTUEAnimationManager;

    iget-object v1, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->jeanImageView:Lcom/shopkick/app/widget/RoundImageView;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/ftue/FTUEAnimationManager;->setRoundImageView(Lcom/shopkick/app/widget/RoundImageView;)V

    .line 524
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->animationManager:Lcom/shopkick/app/ftue/FTUEAnimationManager;

    iget-object v1, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->jeanImageViewAnimated:Lcom/shopkick/app/widget/RoundImageView;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/ftue/FTUEAnimationManager;->setRoundImageViewAnimated(Lcom/shopkick/app/widget/RoundImageView;)V

    .line 525
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->animationSetupList:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 526
    iget-object p1, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->animationManager:Lcom/shopkick/app/ftue/FTUEAnimationManager;

    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->animationSetupList:Ljava/util/List;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/ftue/FTUEAnimationManager;->setAnimatedSentences(Ljava/util/List;)V

    .line 527
    iget-object p1, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->animationManager:Lcom/shopkick/app/ftue/FTUEAnimationManager;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/ftue/FTUEAnimationManager;->setTextAnimationFinishListener(Lcom/shopkick/app/ftue/FTUEAnimationManager$FTUEAnimationManagerTextAnimationFinishListener;)V

    .line 528
    iget-object p1, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->animationManager:Lcom/shopkick/app/ftue/FTUEAnimationManager;

    invoke-virtual {p1, p3}, Lcom/shopkick/app/ftue/FTUEAnimationManager;->setOverlayDismissListener(Lcom/shopkick/app/ftue/FTUEAnimationManager$FTUEAnimationManagerOverlayDismissListener;)V

    .line 529
    iget-object p1, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->animationManager:Lcom/shopkick/app/ftue/FTUEAnimationManager;

    iget-object p2, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->parentLayout:Lcom/shopkick/app/ftue/DragConstraintLayout;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/ftue/FTUEAnimationManager;->setOverlayLayout(Lcom/shopkick/app/ftue/DragConstraintLayout;)V

    if-eqz p4, :cond_0

    .line 531
    iget-object p1, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->animationManager:Lcom/shopkick/app/ftue/FTUEAnimationManager;

    const/16 p2, 0x258

    invoke-virtual {p1, p2}, Lcom/shopkick/app/ftue/FTUEAnimationManager;->startTextViewAnimation(I)V

    :cond_0
    return-void
.end method


# virtual methods
.method public createView(Landroid/content/Context;)Landroid/view/View;
    .locals 11

    .line 116
    invoke-super {p0, p1}, Lcom/shopkick/app/overlays/base/SKOverlay;->createView(Landroid/content/Context;)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/constraint/ConstraintLayout;

    iput-object v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->mainView:Landroid/view/ViewGroup;

    .line 118
    iput-object p1, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->context:Landroid/content/Context;

    .line 119
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->mainView:Landroid/view/ViewGroup;

    const v1, 0x7f090505

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/ftue/DragConstraintLayout;

    iput-object v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->parentLayout:Lcom/shopkick/app/ftue/DragConstraintLayout;

    .line 120
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->mainView:Landroid/view/ViewGroup;

    const v1, 0x7f09035a

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/widget/SKTextView;

    iput-object v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->jeanDialogTv:Lcom/shopkick/app/widget/SKTextView;

    .line 121
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->mainView:Landroid/view/ViewGroup;

    const v1, 0x7f09035b

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/widget/SKTextView;

    iput-object v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->jeanDialogTvHidden:Lcom/shopkick/app/widget/SKTextView;

    .line 122
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->mainView:Landroid/view/ViewGroup;

    const v1, 0x7f09072c

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/widget/SKTextView;

    iput-object v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->tapToContinueTv:Lcom/shopkick/app/widget/SKTextView;

    .line 123
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->mainView:Landroid/view/ViewGroup;

    const v1, 0x7f0907ca

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    iput-object v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->videoCarouselRecyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    .line 124
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->mainView:Landroid/view/ViewGroup;

    const v1, 0x7f090510

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->pauseButton:Landroid/view/View;

    .line 125
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->mainView:Landroid/view/ViewGroup;

    const v1, 0x7f090087

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->overlayBackground:Landroid/view/View;

    .line 126
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->mainView:Landroid/view/ViewGroup;

    const v1, 0x7f09035e

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/widget/RoundImageView;

    iput-object v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->jeanImageView:Lcom/shopkick/app/widget/RoundImageView;

    .line 127
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->mainView:Landroid/view/ViewGroup;

    const v1, 0x7f09035f

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/widget/RoundImageView;

    iput-object v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->jeanImageViewAnimated:Lcom/shopkick/app/widget/RoundImageView;

    .line 129
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->mainView:Landroid/view/ViewGroup;

    const v1, 0x7f09045f

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/constraint/ConstraintLayout;

    const/4 v1, 0x0

    .line 130
    invoke-virtual {v0, v1}, Landroid/support/constraint/ConstraintLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 132
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->videoCarouselRecyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    new-instance v1, Landroid/support/v7/widget/GridLayoutManager;

    .line 133
    invoke-virtual {p0}, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v2

    invoke-virtual {v2}, Lcom/shopkick/app/activities/BaseActivity;->getBaseContext()Landroid/content/Context;

    move-result-object v2

    const/4 v3, 0x2

    invoke-direct {v1, v2, v3}, Landroid/support/v7/widget/GridLayoutManager;-><init>(Landroid/content/Context;I)V

    .line 132
    invoke-virtual {v0, v1}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 135
    new-instance v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    iget-object v5, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    invoke-virtual {p0}, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v1

    invoke-virtual {v1}, Lcom/shopkick/app/activities/BaseActivity;->getTopScreen()Lcom/shopkick/app/screens/AppScreen;

    move-result-object v6

    iget-object v8, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->videoCarouselRecyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    .line 136
    invoke-direct {p0}, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->getSupportedTileTypes()Ljava/util/HashSet;

    move-result-object v9

    const/4 v7, 0x0

    const/4 v10, 0x0

    move-object v4, v0

    invoke-direct/range {v4 .. v10}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;-><init>(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/screens/AppScreen;Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$IFeedRecyclerViewAdapterCallback;Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;Ljava/util/Collection;Ljava/util/ArrayList;)V

    iput-object v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->recyclerViewAdapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    .line 138
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->videoCarouselRecyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    iget-object v1, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->recyclerViewAdapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    .line 141
    :try_start_0
    invoke-direct {p0, p1}, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->configureScanVideo(Landroid/content/Context;)V

    .line 142
    invoke-direct {p0, p1}, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->configureWalkinVideo(Landroid/content/Context;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 144
    invoke-virtual {p1}, Ljava/io/IOException;->printStackTrace()V

    .line 147
    :goto_0
    iget-object p1, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->mainView:Landroid/view/ViewGroup;

    return-object p1
.end method

.method protected getOverlayTheme()I
    .locals 1

    const v0, 0x7f12016c

    return v0
.end method

.method protected getResId()I
    .locals 1

    const v0, 0x7f0c00ce

    return v0
.end method

.method public getView()Landroid/view/View;
    .locals 1

    .line 157
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->mainView:Landroid/view/ViewGroup;

    return-object v0
.end method

.method public init(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;)V
    .locals 1

    .line 102
    invoke-super {p0, p1, p2}, Lcom/shopkick/app/overlays/base/SKOverlay;->init(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;)V

    .line 103
    iget-object v0, p1, Lcom/shopkick/app/application/ScreenGlobals;->logger:Lcom/shopkick/app/application/SKLogger;

    iput-object v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->logger:Lcom/shopkick/app/application/SKLogger;

    .line 104
    iput-object p1, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    .line 105
    iget-object v0, p1, Lcom/shopkick/app/application/ScreenGlobals;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    iput-object v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->appPreferences:Lcom/shopkick/app/application/AppPreferences;

    .line 106
    iget-object p1, p1, Lcom/shopkick/app/application/ScreenGlobals;->videoController:Lcom/shopkick/app/video/VideoController;

    iput-object p1, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->videoController:Lcom/shopkick/app/video/VideoController;

    .line 107
    iget-object p1, p2, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->scanKickAmount:Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iput p1, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->numberOfScans:I

    .line 108
    iget-object p1, p2, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->walkinKickAmount:Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iput p1, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->numberOfWalkins:I

    .line 109
    iget-object p1, p2, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->userScanCount:Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iput p1, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->userScanCount:I

    .line 110
    iget-object p1, p2, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->userWalkinCount:Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iput p1, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->userWalkinCount:I

    .line 111
    iget-object p1, p2, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->chainName:Ljava/lang/String;

    iput-object p1, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->chainName:Ljava/lang/String;

    return-void
.end method

.method public isCancelable()Z
    .locals 2

    .line 167
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->appPreferences:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {v0}, Lcom/shopkick/app/application/AppPreferences;->getFtueStoreDetailsCurrentStage()I

    move-result v0

    const/4 v1, 0x5

    if-eq v0, v1, :cond_0

    packed-switch v0, :pswitch_data_0

    const/4 v0, 0x0

    return v0

    :cond_0
    :pswitch_0
    const/4 v0, 0x1

    return v0

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public onOverlayDismissed(Landroid/content/Context;Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;)V
    .locals 2

    .line 200
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->animationManager:Lcom/shopkick/app/ftue/FTUEAnimationManager;

    invoke-static {v0}, Lcom/shopkick/app/util/NullUtils;->isNull(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 201
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->animationManager:Lcom/shopkick/app/ftue/FTUEAnimationManager;

    invoke-virtual {v0}, Lcom/shopkick/app/ftue/FTUEAnimationManager;->cleanFTUEAnimationManager()V

    const/4 v0, 0x0

    .line 202
    iput-object v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->animationManager:Lcom/shopkick/app/ftue/FTUEAnimationManager;

    .line 205
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->appPreferences:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {v0}, Lcom/shopkick/app/application/AppPreferences;->getFtueStoreDetailsCurrentStage()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 207
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->appPreferences:Lcom/shopkick/app/application/AppPreferences;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/application/AppPreferences;->setFtueStoreDetailsLessonPaused(Z)V

    .line 209
    :cond_1
    invoke-super {p0, p1, p2}, Lcom/shopkick/app/overlays/base/SKOverlay;->onOverlayDismissed(Landroid/content/Context;Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;)V

    return-void
.end method

.method public onOverlayShown(Landroid/content/Context;Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;)V
    .locals 2

    .line 180
    invoke-super {p0, p1, p2}, Lcom/shopkick/app/overlays/base/SKOverlay;->onOverlayShown(Landroid/content/Context;Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;)V

    .line 182
    new-instance p2, Lcom/shopkick/app/ftue/FTUEAnimationManager;

    invoke-direct {p2, p1}, Lcom/shopkick/app/ftue/FTUEAnimationManager;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->animationManager:Lcom/shopkick/app/ftue/FTUEAnimationManager;

    .line 183
    iget-object p1, p0, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->appPreferences:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {p1}, Lcom/shopkick/app/application/AppPreferences;->getFtueStoreDetailsLessonStarted()Z

    move-result p1

    if-nez p1, :cond_0

    .line 184
    invoke-direct {p0}, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->setLayoutStage1()V

    goto :goto_0

    .line 186
    :cond_0
    invoke-direct {p0}, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;->setLayoutStage2()V

    .line 189
    :goto_0
    new-instance p1, Landroid/os/Handler;

    invoke-direct {p1}, Landroid/os/Handler;-><init>()V

    .line 190
    new-instance p2, Lcom/shopkick/app/ftue/-$$Lambda$FTUEStoreDetailsLessonOverlay$brEY_z95LyuBVGq5xllek6UUxm8;

    invoke-direct {p2, p0}, Lcom/shopkick/app/ftue/-$$Lambda$FTUEStoreDetailsLessonOverlay$brEY_z95LyuBVGq5xllek6UUxm8;-><init>(Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;)V

    const-wide/16 v0, 0x64

    invoke-virtual {p1, p2, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method
