.class public Lcom/shopkick/app/controllers/ProfilePictureHelper$ProfilePictureHelperFactory;
.super Ljava/lang/Object;
.source "ProfilePictureHelper.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/controllers/ProfilePictureHelper;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ProfilePictureHelperFactory"
.end annotation


# instance fields
.field private appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

.field private contentResolver:Landroid/content/ContentResolver;

.field private context:Landroid/content/Context;

.field private mediaConnection:Landroid/media/MediaScannerConnection;

.field private mediaConnectionClient:Lcom/shopkick/app/util/SKMediaScannerConnectionClient;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/shopkick/app/application/AppActivityManager;Landroid/content/ContentResolver;Landroid/media/MediaScannerConnection;Lcom/shopkick/app/util/SKMediaScannerConnectionClient;)V
    .locals 0

    .line 513
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 514
    iput-object p1, p0, Lcom/shopkick/app/controllers/ProfilePictureHelper$ProfilePictureHelperFactory;->context:Landroid/content/Context;

    .line 515
    iput-object p2, p0, Lcom/shopkick/app/controllers/ProfilePictureHelper$ProfilePictureHelperFactory;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    .line 516
    iput-object p3, p0, Lcom/shopkick/app/controllers/ProfilePictureHelper$ProfilePictureHelperFactory;->contentResolver:Landroid/content/ContentResolver;

    .line 517
    iput-object p4, p0, Lcom/shopkick/app/controllers/ProfilePictureHelper$ProfilePictureHelperFactory;->mediaConnection:Landroid/media/MediaScannerConnection;

    .line 518
    iput-object p5, p0, Lcom/shopkick/app/controllers/ProfilePictureHelper$ProfilePictureHelperFactory;->mediaConnectionClient:Lcom/shopkick/app/util/SKMediaScannerConnectionClient;

    return-void
.end method


# virtual methods
.method public createProfilePictureHelper()Lcom/shopkick/app/controllers/ProfilePictureHelper;
    .locals 7

    .line 522
    new-instance v6, Lcom/shopkick/app/controllers/ProfilePictureHelper;

    iget-object v1, p0, Lcom/shopkick/app/controllers/ProfilePictureHelper$ProfilePictureHelperFactory;->context:Landroid/content/Context;

    iget-object v2, p0, Lcom/shopkick/app/controllers/ProfilePictureHelper$ProfilePictureHelperFactory;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    iget-object v3, p0, Lcom/shopkick/app/controllers/ProfilePictureHelper$ProfilePictureHelperFactory;->contentResolver:Landroid/content/ContentResolver;

    iget-object v4, p0, Lcom/shopkick/app/controllers/ProfilePictureHelper$ProfilePictureHelperFactory;->mediaConnection:Landroid/media/MediaScannerConnection;

    iget-object v5, p0, Lcom/shopkick/app/controllers/ProfilePictureHelper$ProfilePictureHelperFactory;->mediaConnectionClient:Lcom/shopkick/app/util/SKMediaScannerConnectionClient;

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lcom/shopkick/app/controllers/ProfilePictureHelper;-><init>(Landroid/content/Context;Lcom/shopkick/app/application/AppActivityManager;Landroid/content/ContentResolver;Landroid/media/MediaScannerConnection;Lcom/shopkick/app/util/SKMediaScannerConnectionClient;)V

    return-object v6
.end method
