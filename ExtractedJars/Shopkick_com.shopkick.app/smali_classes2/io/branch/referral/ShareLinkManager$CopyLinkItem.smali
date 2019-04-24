.class Lio/branch/referral/ShareLinkManager$CopyLinkItem;
.super Landroid/content/pm/ResolveInfo;
.source "ShareLinkManager.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/branch/referral/ShareLinkManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "CopyLinkItem"
.end annotation


# instance fields
.field final synthetic this$0:Lio/branch/referral/ShareLinkManager;


# direct methods
.method private constructor <init>(Lio/branch/referral/ShareLinkManager;)V
    .locals 0

    .line 464
    iput-object p1, p0, Lio/branch/referral/ShareLinkManager$CopyLinkItem;->this$0:Lio/branch/referral/ShareLinkManager;

    invoke-direct {p0}, Landroid/content/pm/ResolveInfo;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lio/branch/referral/ShareLinkManager;Lio/branch/referral/ShareLinkManager$1;)V
    .locals 0

    .line 464
    invoke-direct {p0, p1}, Lio/branch/referral/ShareLinkManager$CopyLinkItem;-><init>(Lio/branch/referral/ShareLinkManager;)V

    return-void
.end method


# virtual methods
.method public loadIcon(Landroid/content/pm/PackageManager;)Landroid/graphics/drawable/Drawable;
    .locals 0

    .line 474
    iget-object p1, p0, Lio/branch/referral/ShareLinkManager$CopyLinkItem;->this$0:Lio/branch/referral/ShareLinkManager;

    invoke-static {p1}, Lio/branch/referral/ShareLinkManager;->access$400(Lio/branch/referral/ShareLinkManager;)Lio/branch/referral/Branch$ShareLinkBuilder;

    move-result-object p1

    invoke-virtual {p1}, Lio/branch/referral/Branch$ShareLinkBuilder;->getCopyUrlIcon()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    return-object p1
.end method

.method public loadLabel(Landroid/content/pm/PackageManager;)Ljava/lang/CharSequence;
    .locals 0

    .line 468
    iget-object p1, p0, Lio/branch/referral/ShareLinkManager$CopyLinkItem;->this$0:Lio/branch/referral/ShareLinkManager;

    invoke-static {p1}, Lio/branch/referral/ShareLinkManager;->access$400(Lio/branch/referral/ShareLinkManager;)Lio/branch/referral/Branch$ShareLinkBuilder;

    move-result-object p1

    invoke-virtual {p1}, Lio/branch/referral/Branch$ShareLinkBuilder;->getCopyURlText()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
