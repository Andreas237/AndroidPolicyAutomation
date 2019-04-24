.class Lio/branch/referral/ShareLinkManager;
.super Ljava/lang/Object;
.source "ShareLinkManager.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/branch/referral/ShareLinkManager$CopyLinkItem;,
        Lio/branch/referral/ShareLinkManager$MoreShareItem;,
        Lio/branch/referral/ShareLinkManager$ShareItemView;,
        Lio/branch/referral/ShareLinkManager$ChooserArrayAdapter;
    }
.end annotation


# static fields
.field private static viewItemMinHeight_:I = 0x64


# instance fields
.field private final BG_COLOR_DISABLED:I

.field private final BG_COLOR_ENABLED:I

.field private appList_:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/content/pm/ResolveInfo;",
            ">;"
        }
    .end annotation
.end field

.field private builder_:Lio/branch/referral/Branch$ShareLinkBuilder;

.field callback_:Lio/branch/referral/Branch$BranchLinkShareListener;

.field channelPropertiesCallback_:Lio/branch/referral/Branch$IChannelProperties;

.field context_:Landroid/content/Context;

.field private excludeFromShareSheet:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private iconSize_:I

.field private includeInShareSheet:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private isShareInProgress_:Z

.field final leftMargin:I

.field final padding:I

.field private shareDialogThemeID_:I

.field shareDlg_:Lio/branch/referral/AnimatedDialog;

.field private shareLinkIntent_:Landroid/content/Intent;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method constructor <init>()V
    .locals 4

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x38

    const/4 v1, 0x4

    const/16 v2, 0x11

    const/16 v3, 0x3c

    .line 43
    invoke-static {v3, v2, v1, v0}, Landroid/graphics/Color;->argb(IIII)I

    move-result v3

    iput v3, p0, Lio/branch/referral/ShareLinkManager;->BG_COLOR_ENABLED:I

    const/16 v3, 0x14

    .line 45
    invoke-static {v3, v2, v1, v0}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    iput v0, p0, Lio/branch/referral/ShareLinkManager;->BG_COLOR_DISABLED:I

    const/4 v0, 0x0

    .line 51
    iput-boolean v0, p0, Lio/branch/referral/ShareLinkManager;->isShareInProgress_:Z

    const/4 v0, -0x1

    .line 53
    iput v0, p0, Lio/branch/referral/ShareLinkManager;->shareDialogThemeID_:I

    const/16 v0, 0x32

    .line 55
    iput v0, p0, Lio/branch/referral/ShareLinkManager;->iconSize_:I

    const/4 v0, 0x5

    .line 57
    iput v0, p0, Lio/branch/referral/ShareLinkManager;->padding:I

    const/16 v0, 0x64

    .line 58
    iput v0, p0, Lio/branch/referral/ShareLinkManager;->leftMargin:I

    .line 59
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lio/branch/referral/ShareLinkManager;->includeInShareSheet:Ljava/util/List;

    .line 60
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lio/branch/referral/ShareLinkManager;->excludeFromShareSheet:Ljava/util/List;

    return-void
.end method

.method static synthetic access$1000(Lio/branch/referral/ShareLinkManager;)I
    .locals 0

    .line 32
    iget p0, p0, Lio/branch/referral/ShareLinkManager;->BG_COLOR_ENABLED:I

    return p0
.end method

.method static synthetic access$1100(Lio/branch/referral/ShareLinkManager;)I
    .locals 0

    .line 32
    iget p0, p0, Lio/branch/referral/ShareLinkManager;->BG_COLOR_DISABLED:I

    return p0
.end method

.method static synthetic access$300(Lio/branch/referral/ShareLinkManager;)Ljava/util/List;
    .locals 0

    .line 32
    iget-object p0, p0, Lio/branch/referral/ShareLinkManager;->appList_:Ljava/util/List;

    return-object p0
.end method

.method static synthetic access$302(Lio/branch/referral/ShareLinkManager;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 32
    iput-object p1, p0, Lio/branch/referral/ShareLinkManager;->appList_:Ljava/util/List;

    return-object p1
.end method

.method static synthetic access$400(Lio/branch/referral/ShareLinkManager;)Lio/branch/referral/Branch$ShareLinkBuilder;
    .locals 0

    .line 32
    iget-object p0, p0, Lio/branch/referral/ShareLinkManager;->builder_:Lio/branch/referral/Branch$ShareLinkBuilder;

    return-object p0
.end method

.method static synthetic access$402(Lio/branch/referral/ShareLinkManager;Lio/branch/referral/Branch$ShareLinkBuilder;)Lio/branch/referral/Branch$ShareLinkBuilder;
    .locals 0

    .line 32
    iput-object p1, p0, Lio/branch/referral/ShareLinkManager;->builder_:Lio/branch/referral/Branch$ShareLinkBuilder;

    return-object p1
.end method

.method static synthetic access$500(Lio/branch/referral/ShareLinkManager;Landroid/content/pm/ResolveInfo;)V
    .locals 0

    .line 32
    invoke-direct {p0, p1}, Lio/branch/referral/ShareLinkManager;->invokeSharingClient(Landroid/content/pm/ResolveInfo;)V

    return-void
.end method

.method static synthetic access$600(Lio/branch/referral/ShareLinkManager;)Z
    .locals 0

    .line 32
    iget-boolean p0, p0, Lio/branch/referral/ShareLinkManager;->isShareInProgress_:Z

    return p0
.end method

.method static synthetic access$602(Lio/branch/referral/ShareLinkManager;Z)Z
    .locals 0

    .line 32
    iput-boolean p1, p0, Lio/branch/referral/ShareLinkManager;->isShareInProgress_:Z

    return p1
.end method

.method static synthetic access$700(Lio/branch/referral/ShareLinkManager;Landroid/content/pm/ResolveInfo;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 32
    invoke-direct {p0, p1, p2, p3}, Lio/branch/referral/ShareLinkManager;->shareWithClient(Landroid/content/pm/ResolveInfo;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$800(Lio/branch/referral/ShareLinkManager;)I
    .locals 0

    .line 32
    iget p0, p0, Lio/branch/referral/ShareLinkManager;->iconSize_:I

    return p0
.end method

.method static synthetic access$900()I
    .locals 1

    .line 32
    sget v0, Lio/branch/referral/ShareLinkManager;->viewItemMinHeight_:I

    return v0
.end method

.method static synthetic access$902(I)I
    .locals 0

    .line 32
    sput p0, Lio/branch/referral/ShareLinkManager;->viewItemMinHeight_:I

    return p0
.end method

.method private addLinkToClipBoard(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    .line 347
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xb

    if-ge v0, v1, :cond_0

    .line 349
    iget-object p2, p0, Lio/branch/referral/ShareLinkManager;->context_:Landroid/content/Context;

    const-string v0, "clipboard"

    invoke-virtual {p2, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/text/ClipboardManager;

    .line 350
    invoke-virtual {p2, p1}, Landroid/text/ClipboardManager;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 352
    :cond_0
    iget-object v0, p0, Lio/branch/referral/ShareLinkManager;->context_:Landroid/content/Context;

    const-string v1, "clipboard"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/ClipboardManager;

    .line 353
    invoke-static {p2, p1}, Landroid/content/ClipData;->newPlainText(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/content/ClipData;

    move-result-object p1

    .line 354
    invoke-virtual {v0, p1}, Landroid/content/ClipboardManager;->setPrimaryClip(Landroid/content/ClipData;)V

    .line 356
    :goto_0
    iget-object p1, p0, Lio/branch/referral/ShareLinkManager;->context_:Landroid/content/Context;

    iget-object p2, p0, Lio/branch/referral/ShareLinkManager;->builder_:Lio/branch/referral/Branch$ShareLinkBuilder;

    invoke-virtual {p2}, Lio/branch/referral/Branch$ShareLinkBuilder;->getUrlCopiedMessage()Ljava/lang/String;

    move-result-object p2

    const/4 v0, 0x0

    invoke-static {p1, p2, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    return-void
.end method

.method private createShareDialog(Ljava/util/List;)V
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/branch/referral/SharingHelper$SHARE_WITH;",
            ">;)V"
        }
    .end annotation

    .line 117
    iget-object v0, p0, Lio/branch/referral/ShareLinkManager;->context_:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    .line 118
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 119
    iget-object v2, p0, Lio/branch/referral/ShareLinkManager;->shareLinkIntent_:Landroid/content/Intent;

    const/high16 v3, 0x10000

    invoke-virtual {v0, v2, v3}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object v0

    .line 120
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 121
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 122
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 125
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_0
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    const/4 v7, 0x0

    if-eqz v6, :cond_3

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroid/content/pm/ResolveInfo;

    .line 127
    iget-object v8, v6, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    iget-object v8, v8, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    .line 128
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :cond_1
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_2

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lio/branch/referral/SharingHelper$SHARE_WITH;

    .line 129
    iget-object v11, v6, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    if-eqz v11, :cond_1

    invoke-virtual {v8}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v10}, Lio/branch/referral/SharingHelper$SHARE_WITH;->toString()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v12}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v11, v12}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v11

    if-eqz v11, :cond_1

    move-object v7, v10

    :cond_2
    if-eqz v7, :cond_0

    .line 135
    invoke-interface {v1, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 136
    invoke-interface {p1, v7}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    .line 140
    :cond_3
    invoke-interface {v0, v1}, Ljava/util/List;->removeAll(Ljava/util/Collection;)Z

    const/4 p1, 0x0

    .line 141
    invoke-interface {v0, p1, v1}, Ljava/util/List;->addAll(ILjava/util/Collection;)Z

    .line 144
    iget-object v5, p0, Lio/branch/referral/ShareLinkManager;->includeInShareSheet:Ljava/util/List;

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v5

    if-lez v5, :cond_5

    .line 145
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_4
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_6

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroid/content/pm/ResolveInfo;

    .line 146
    iget-object v8, p0, Lio/branch/referral/ShareLinkManager;->includeInShareSheet:Ljava/util/List;

    iget-object v9, v6, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    iget-object v9, v9, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    invoke-interface {v8, v9}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_4

    .line 147
    invoke-interface {v2, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_5
    move-object v2, v0

    .line 155
    :cond_6
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_7
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_8

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/content/pm/ResolveInfo;

    .line 156
    iget-object v6, p0, Lio/branch/referral/ShareLinkManager;->excludeFromShareSheet:Ljava/util/List;

    iget-object v8, v5, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    iget-object v8, v8, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    invoke-interface {v6, v8}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_7

    .line 157
    invoke-interface {v3, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 162
    :cond_8
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_9
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_b

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/content/pm/ResolveInfo;

    .line 163
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_a
    :goto_3
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_9

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lio/branch/referral/SharingHelper$SHARE_WITH;

    .line 164
    invoke-virtual {v8}, Lio/branch/referral/SharingHelper$SHARE_WITH;->toString()Ljava/lang/String;

    move-result-object v8

    iget-object v9, v5, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    iget-object v9, v9, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    invoke-virtual {v8, v9}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_a

    .line 165
    invoke-interface {v3, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 169
    :cond_b
    new-instance v2, Lio/branch/referral/ShareLinkManager$CopyLinkItem;

    invoke-direct {v2, p0, v7}, Lio/branch/referral/ShareLinkManager$CopyLinkItem;-><init>(Lio/branch/referral/ShareLinkManager;Lio/branch/referral/ShareLinkManager$1;)V

    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 170
    new-instance v2, Lio/branch/referral/ShareLinkManager$CopyLinkItem;

    invoke-direct {v2, p0, v7}, Lio/branch/referral/ShareLinkManager$CopyLinkItem;-><init>(Lio/branch/referral/ShareLinkManager;Lio/branch/referral/ShareLinkManager$1;)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 171
    new-instance v2, Lio/branch/referral/ShareLinkManager$CopyLinkItem;

    invoke-direct {v2, p0, v7}, Lio/branch/referral/ShareLinkManager$CopyLinkItem;-><init>(Lio/branch/referral/ShareLinkManager;Lio/branch/referral/ShareLinkManager$1;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 173
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    const/4 v4, 0x1

    if-le v2, v4, :cond_d

    .line 175
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    if-le v0, v2, :cond_c

    .line 176
    new-instance v0, Lio/branch/referral/ShareLinkManager$MoreShareItem;

    invoke-direct {v0, p0, v7}, Lio/branch/referral/ShareLinkManager$MoreShareItem;-><init>(Lio/branch/referral/ShareLinkManager;Lio/branch/referral/ShareLinkManager$1;)V

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 178
    :cond_c
    iput-object v1, p0, Lio/branch/referral/ShareLinkManager;->appList_:Ljava/util/List;

    goto :goto_4

    .line 180
    :cond_d
    iput-object v3, p0, Lio/branch/referral/ShareLinkManager;->appList_:Ljava/util/List;

    .line 184
    :goto_4
    new-instance v0, Lio/branch/referral/ShareLinkManager$ChooserArrayAdapter;

    invoke-direct {v0, p0, v7}, Lio/branch/referral/ShareLinkManager$ChooserArrayAdapter;-><init>(Lio/branch/referral/ShareLinkManager;Lio/branch/referral/ShareLinkManager$1;)V

    .line 186
    iget v1, p0, Lio/branch/referral/ShareLinkManager;->shareDialogThemeID_:I

    if-le v1, v4, :cond_e

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x15

    if-lt v1, v2, :cond_e

    .line 187
    new-instance v1, Landroid/widget/ListView;

    iget-object v2, p0, Lio/branch/referral/ShareLinkManager;->context_:Landroid/content/Context;

    iget v4, p0, Lio/branch/referral/ShareLinkManager;->shareDialogThemeID_:I

    invoke-direct {v1, v2, v7, p1, v4}, Landroid/widget/ListView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    goto :goto_5

    .line 189
    :cond_e
    new-instance v1, Landroid/widget/ListView;

    iget-object v2, p0, Lio/branch/referral/ShareLinkManager;->context_:Landroid/content/Context;

    invoke-direct {v1, v2}, Landroid/widget/ListView;-><init>(Landroid/content/Context;)V

    .line 191
    :goto_5
    invoke-virtual {v1, p1}, Landroid/widget/ListView;->setHorizontalFadingEdgeEnabled(Z)V

    const/4 v2, -0x1

    .line 192
    invoke-virtual {v1, v2}, Landroid/widget/ListView;->setBackgroundColor(I)V

    .line 193
    new-instance v2, Landroid/graphics/drawable/ColorDrawable;

    invoke-direct {v2, p1}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {v1, v2}, Landroid/widget/ListView;->setSelector(Landroid/graphics/drawable/Drawable;)V

    .line 195
    iget-object v2, p0, Lio/branch/referral/ShareLinkManager;->builder_:Lio/branch/referral/Branch$ShareLinkBuilder;

    invoke-virtual {v2}, Lio/branch/referral/Branch$ShareLinkBuilder;->getSharingTitleView()Landroid/view/View;

    move-result-object v2

    if-eqz v2, :cond_f

    .line 196
    iget-object v2, p0, Lio/branch/referral/ShareLinkManager;->builder_:Lio/branch/referral/Branch$ShareLinkBuilder;

    invoke-virtual {v2}, Lio/branch/referral/Branch$ShareLinkBuilder;->getSharingTitleView()Landroid/view/View;

    move-result-object v2

    invoke-virtual {v1, v2, v7, p1}, Landroid/widget/ListView;->addHeaderView(Landroid/view/View;Ljava/lang/Object;Z)V

    goto :goto_6

    .line 197
    :cond_f
    iget-object v2, p0, Lio/branch/referral/ShareLinkManager;->builder_:Lio/branch/referral/Branch$ShareLinkBuilder;

    invoke-virtual {v2}, Lio/branch/referral/Branch$ShareLinkBuilder;->getSharingTitle()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_10

    .line 198
    new-instance v2, Landroid/widget/TextView;

    iget-object v4, p0, Lio/branch/referral/ShareLinkManager;->context_:Landroid/content/Context;

    invoke-direct {v2, v4}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 199
    iget-object v4, p0, Lio/branch/referral/ShareLinkManager;->builder_:Lio/branch/referral/Branch$ShareLinkBuilder;

    invoke-virtual {v4}, Lio/branch/referral/Branch$ShareLinkBuilder;->getSharingTitle()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 200
    iget v4, p0, Lio/branch/referral/ShareLinkManager;->BG_COLOR_DISABLED:I

    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setBackgroundColor(I)V

    .line 201
    iget v4, p0, Lio/branch/referral/ShareLinkManager;->BG_COLOR_DISABLED:I

    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setTextColor(I)V

    .line 202
    iget-object v4, p0, Lio/branch/referral/ShareLinkManager;->context_:Landroid/content/Context;

    const v5, 0x1030044

    invoke-virtual {v2, v4, v5}, Landroid/widget/TextView;->setTextAppearance(Landroid/content/Context;I)V

    .line 203
    iget-object v4, p0, Lio/branch/referral/ShareLinkManager;->context_:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const/high16 v5, 0x1060000

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getColor(I)I

    move-result v4

    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setTextColor(I)V

    const/16 v4, 0x64

    const/4 v5, 0x5

    .line 204
    invoke-virtual {v2, v4, v5, v5, v5}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 205
    invoke-virtual {v1, v2, v7, p1}, Landroid/widget/ListView;->addHeaderView(Landroid/view/View;Ljava/lang/Object;Z)V

    .line 208
    :cond_10
    :goto_6
    invoke-virtual {v1, v0}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 210
    iget-object v2, p0, Lio/branch/referral/ShareLinkManager;->builder_:Lio/branch/referral/Branch$ShareLinkBuilder;

    invoke-virtual {v2}, Lio/branch/referral/Branch$ShareLinkBuilder;->getDividerHeight()I

    move-result v2

    if-ltz v2, :cond_11

    .line 211
    iget-object p1, p0, Lio/branch/referral/ShareLinkManager;->builder_:Lio/branch/referral/Branch$ShareLinkBuilder;

    invoke-virtual {p1}, Lio/branch/referral/Branch$ShareLinkBuilder;->getDividerHeight()I

    move-result p1

    invoke-virtual {v1, p1}, Landroid/widget/ListView;->setDividerHeight(I)V

    goto :goto_7

    .line 212
    :cond_11
    iget-object v2, p0, Lio/branch/referral/ShareLinkManager;->builder_:Lio/branch/referral/Branch$ShareLinkBuilder;

    invoke-virtual {v2}, Lio/branch/referral/Branch$ShareLinkBuilder;->getIsFullWidthStyle()Z

    move-result v2

    if-eqz v2, :cond_12

    .line 213
    invoke-virtual {v1, p1}, Landroid/widget/ListView;->setDividerHeight(I)V

    .line 216
    :cond_12
    :goto_7
    new-instance p1, Lio/branch/referral/ShareLinkManager$1;

    invoke-direct {p1, p0, v3, v0, v1}, Lio/branch/referral/ShareLinkManager$1;-><init>(Lio/branch/referral/ShareLinkManager;Ljava/util/List;Lio/branch/referral/ShareLinkManager$ChooserArrayAdapter;Landroid/widget/ListView;)V

    invoke-virtual {v1, p1}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 240
    iget-object p1, p0, Lio/branch/referral/ShareLinkManager;->builder_:Lio/branch/referral/Branch$ShareLinkBuilder;

    invoke-virtual {p1}, Lio/branch/referral/Branch$ShareLinkBuilder;->getDialogThemeResourceID()I

    move-result p1

    if-lez p1, :cond_13

    .line 241
    new-instance p1, Lio/branch/referral/AnimatedDialog;

    iget-object v0, p0, Lio/branch/referral/ShareLinkManager;->context_:Landroid/content/Context;

    iget-object v2, p0, Lio/branch/referral/ShareLinkManager;->builder_:Lio/branch/referral/Branch$ShareLinkBuilder;

    invoke-virtual {v2}, Lio/branch/referral/Branch$ShareLinkBuilder;->getDialogThemeResourceID()I

    move-result v2

    invoke-direct {p1, v0, v2}, Lio/branch/referral/AnimatedDialog;-><init>(Landroid/content/Context;I)V

    iput-object p1, p0, Lio/branch/referral/ShareLinkManager;->shareDlg_:Lio/branch/referral/AnimatedDialog;

    goto :goto_8

    .line 243
    :cond_13
    new-instance p1, Lio/branch/referral/AnimatedDialog;

    iget-object v0, p0, Lio/branch/referral/ShareLinkManager;->context_:Landroid/content/Context;

    iget-object v2, p0, Lio/branch/referral/ShareLinkManager;->builder_:Lio/branch/referral/Branch$ShareLinkBuilder;

    invoke-virtual {v2}, Lio/branch/referral/Branch$ShareLinkBuilder;->getIsFullWidthStyle()Z

    move-result v2

    invoke-direct {p1, v0, v2}, Lio/branch/referral/AnimatedDialog;-><init>(Landroid/content/Context;Z)V

    iput-object p1, p0, Lio/branch/referral/ShareLinkManager;->shareDlg_:Lio/branch/referral/AnimatedDialog;

    .line 245
    :goto_8
    iget-object p1, p0, Lio/branch/referral/ShareLinkManager;->shareDlg_:Lio/branch/referral/AnimatedDialog;

    invoke-virtual {p1, v1}, Lio/branch/referral/AnimatedDialog;->setContentView(Landroid/view/View;)V

    .line 246
    iget-object p1, p0, Lio/branch/referral/ShareLinkManager;->shareDlg_:Lio/branch/referral/AnimatedDialog;

    invoke-virtual {p1}, Lio/branch/referral/AnimatedDialog;->show()V

    .line 247
    iget-object p1, p0, Lio/branch/referral/ShareLinkManager;->callback_:Lio/branch/referral/Branch$BranchLinkShareListener;

    if-eqz p1, :cond_14

    .line 248
    invoke-interface {p1}, Lio/branch/referral/Branch$BranchLinkShareListener;->onShareLinkDialogLaunched()V

    .line 250
    :cond_14
    iget-object p1, p0, Lio/branch/referral/ShareLinkManager;->shareDlg_:Lio/branch/referral/AnimatedDialog;

    new-instance v0, Lio/branch/referral/ShareLinkManager$2;

    invoke-direct {v0, p0}, Lio/branch/referral/ShareLinkManager$2;-><init>(Lio/branch/referral/ShareLinkManager;)V

    invoke-virtual {p1, v0}, Lio/branch/referral/AnimatedDialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    return-void
.end method

.method private invokeSharingClient(Landroid/content/pm/ResolveInfo;)V
    .locals 4

    const/4 v0, 0x1

    .line 274
    iput-boolean v0, p0, Lio/branch/referral/ShareLinkManager;->isShareInProgress_:Z

    .line 275
    iget-object v1, p0, Lio/branch/referral/ShareLinkManager;->context_:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/content/pm/ResolveInfo;->loadLabel(Landroid/content/pm/PackageManager;)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    .line 276
    iget-object v2, p0, Lio/branch/referral/ShareLinkManager;->builder_:Lio/branch/referral/Branch$ShareLinkBuilder;

    invoke-virtual {v2}, Lio/branch/referral/Branch$ShareLinkBuilder;->getShortLinkBuilder()Lio/branch/referral/BranchShortLinkBuilder;

    move-result-object v2

    .line 278
    new-instance v3, Lio/branch/referral/ShareLinkManager$3;

    invoke-direct {v3, p0, p1, v1}, Lio/branch/referral/ShareLinkManager$3;-><init>(Lio/branch/referral/ShareLinkManager;Landroid/content/pm/ResolveInfo;Ljava/lang/String;)V

    invoke-virtual {v2, v3, v0}, Lio/branch/referral/BranchShortLinkBuilder;->generateShortUrlInternal(Lio/branch/referral/Branch$BranchLinkCreateListener;Z)V

    return-void
.end method

.method private shareWithClient(Landroid/content/pm/ResolveInfo;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 308
    iget-object v0, p0, Lio/branch/referral/ShareLinkManager;->callback_:Lio/branch/referral/Branch$BranchLinkShareListener;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 309
    invoke-interface {v0, p2, p3, v1}, Lio/branch/referral/Branch$BranchLinkShareListener;->onLinkShareResponse(Ljava/lang/String;Ljava/lang/String;Lio/branch/referral/BranchError;)V

    goto :goto_0

    :cond_0
    const-string v0, "BranchSDK"

    .line 311
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Shared link with "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 313
    :goto_0
    instance-of v0, p1, Lio/branch/referral/ShareLinkManager$CopyLinkItem;

    if-eqz v0, :cond_1

    .line 314
    iget-object p1, p0, Lio/branch/referral/ShareLinkManager;->builder_:Lio/branch/referral/Branch$ShareLinkBuilder;

    invoke-virtual {p1}, Lio/branch/referral/Branch$ShareLinkBuilder;->getShareMsg()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p2, p1}, Lio/branch/referral/ShareLinkManager;->addLinkToClipBoard(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    .line 316
    :cond_1
    iget-object v0, p0, Lio/branch/referral/ShareLinkManager;->shareLinkIntent_:Landroid/content/Intent;

    iget-object p1, p1, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    iget-object p1, p1, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    invoke-virtual {v0, p1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 317
    iget-object p1, p0, Lio/branch/referral/ShareLinkManager;->builder_:Lio/branch/referral/Branch$ShareLinkBuilder;

    invoke-virtual {p1}, Lio/branch/referral/Branch$ShareLinkBuilder;->getShareSub()Ljava/lang/String;

    move-result-object p1

    .line 318
    iget-object v0, p0, Lio/branch/referral/ShareLinkManager;->builder_:Lio/branch/referral/Branch$ShareLinkBuilder;

    invoke-virtual {v0}, Lio/branch/referral/Branch$ShareLinkBuilder;->getShareMsg()Ljava/lang/String;

    move-result-object v0

    .line 320
    iget-object v1, p0, Lio/branch/referral/ShareLinkManager;->channelPropertiesCallback_:Lio/branch/referral/Branch$IChannelProperties;

    if-eqz v1, :cond_3

    .line 321
    invoke-interface {v1, p3}, Lio/branch/referral/Branch$IChannelProperties;->getSharingTitleForChannel(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 322
    iget-object v2, p0, Lio/branch/referral/ShareLinkManager;->channelPropertiesCallback_:Lio/branch/referral/Branch$IChannelProperties;

    invoke-interface {v2, p3}, Lio/branch/referral/Branch$IChannelProperties;->getSharingMessageForChannel(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    .line 323
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_2

    move-object p1, v1

    .line 326
    :cond_2
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_3

    move-object v0, p3

    :cond_3
    if-eqz p1, :cond_4

    .line 330
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result p3

    if-lez p3, :cond_4

    .line 331
    iget-object p3, p0, Lio/branch/referral/ShareLinkManager;->shareLinkIntent_:Landroid/content/Intent;

    const-string v1, "android.intent.extra.SUBJECT"

    invoke-virtual {p3, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 333
    :cond_4
    iget-object p1, p0, Lio/branch/referral/ShareLinkManager;->shareLinkIntent_:Landroid/content/Intent;

    const-string p3, "android.intent.extra.TEXT"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\n"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p3, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 334
    iget-object p1, p0, Lio/branch/referral/ShareLinkManager;->context_:Landroid/content/Context;

    iget-object p2, p0, Lio/branch/referral/ShareLinkManager;->shareLinkIntent_:Landroid/content/Intent;

    invoke-virtual {p1, p2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    :goto_1
    return-void
.end method


# virtual methods
.method public cancelShareLinkDialog(Z)V
    .locals 1

    .line 100
    iget-object v0, p0, Lio/branch/referral/ShareLinkManager;->shareDlg_:Lio/branch/referral/AnimatedDialog;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lio/branch/referral/AnimatedDialog;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_1

    if-eqz p1, :cond_0

    .line 103
    iget-object p1, p0, Lio/branch/referral/ShareLinkManager;->shareDlg_:Lio/branch/referral/AnimatedDialog;

    invoke-virtual {p1}, Lio/branch/referral/AnimatedDialog;->cancel()V

    goto :goto_0

    .line 106
    :cond_0
    iget-object p1, p0, Lio/branch/referral/ShareLinkManager;->shareDlg_:Lio/branch/referral/AnimatedDialog;

    invoke-virtual {p1}, Lio/branch/referral/AnimatedDialog;->dismiss()V

    :cond_1
    :goto_0
    return-void
.end method

.method public shareLink(Lio/branch/referral/Branch$ShareLinkBuilder;)Landroid/app/Dialog;
    .locals 3

    .line 69
    iput-object p1, p0, Lio/branch/referral/ShareLinkManager;->builder_:Lio/branch/referral/Branch$ShareLinkBuilder;

    .line 70
    invoke-virtual {p1}, Lio/branch/referral/Branch$ShareLinkBuilder;->getActivity()Landroid/app/Activity;

    move-result-object v0

    iput-object v0, p0, Lio/branch/referral/ShareLinkManager;->context_:Landroid/content/Context;

    .line 71
    invoke-virtual {p1}, Lio/branch/referral/Branch$ShareLinkBuilder;->getCallback()Lio/branch/referral/Branch$BranchLinkShareListener;

    move-result-object v0

    iput-object v0, p0, Lio/branch/referral/ShareLinkManager;->callback_:Lio/branch/referral/Branch$BranchLinkShareListener;

    .line 72
    invoke-virtual {p1}, Lio/branch/referral/Branch$ShareLinkBuilder;->getChannelPropertiesCallback()Lio/branch/referral/Branch$IChannelProperties;

    move-result-object v0

    iput-object v0, p0, Lio/branch/referral/ShareLinkManager;->channelPropertiesCallback_:Lio/branch/referral/Branch$IChannelProperties;

    .line 73
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.SEND"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lio/branch/referral/ShareLinkManager;->shareLinkIntent_:Landroid/content/Intent;

    .line 74
    iget-object v0, p0, Lio/branch/referral/ShareLinkManager;->shareLinkIntent_:Landroid/content/Intent;

    const-string/jumbo v1, "text/plain"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 75
    invoke-virtual {p1}, Lio/branch/referral/Branch$ShareLinkBuilder;->getStyleResourceID()I

    move-result v0

    iput v0, p0, Lio/branch/referral/ShareLinkManager;->shareDialogThemeID_:I

    .line 76
    invoke-virtual {p1}, Lio/branch/referral/Branch$ShareLinkBuilder;->getIncludedInShareSheet()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lio/branch/referral/ShareLinkManager;->includeInShareSheet:Ljava/util/List;

    .line 77
    invoke-virtual {p1}, Lio/branch/referral/Branch$ShareLinkBuilder;->getExcludedFromShareSheet()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lio/branch/referral/ShareLinkManager;->excludeFromShareSheet:Ljava/util/List;

    .line 78
    invoke-virtual {p1}, Lio/branch/referral/Branch$ShareLinkBuilder;->getIconSize()I

    move-result v0

    iput v0, p0, Lio/branch/referral/ShareLinkManager;->iconSize_:I

    .line 80
    :try_start_0
    invoke-virtual {p1}, Lio/branch/referral/Branch$ShareLinkBuilder;->getPreferredOptions()Ljava/util/ArrayList;

    move-result-object p1

    invoke-direct {p0, p1}, Lio/branch/referral/ShareLinkManager;->createShareDialog(Ljava/util/List;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 82
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    .line 83
    iget-object p1, p0, Lio/branch/referral/ShareLinkManager;->callback_:Lio/branch/referral/Branch$BranchLinkShareListener;

    if-eqz p1, :cond_0

    .line 84
    new-instance v0, Lio/branch/referral/BranchError;

    const-string v1, "Trouble sharing link"

    const/16 v2, -0x6e

    invoke-direct {v0, v1, v2}, Lio/branch/referral/BranchError;-><init>(Ljava/lang/String;I)V

    const/4 v1, 0x0

    invoke-interface {p1, v1, v1, v0}, Lio/branch/referral/Branch$BranchLinkShareListener;->onLinkShareResponse(Ljava/lang/String;Ljava/lang/String;Lio/branch/referral/BranchError;)V

    goto :goto_0

    :cond_0
    const-string p1, "BranchSDK"

    const-string v0, "Unable create share options. Couldn\'t find applications on device to share the link."

    .line 86
    invoke-static {p1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 89
    :goto_0
    iget-object p1, p0, Lio/branch/referral/ShareLinkManager;->shareDlg_:Lio/branch/referral/AnimatedDialog;

    return-object p1
.end method
