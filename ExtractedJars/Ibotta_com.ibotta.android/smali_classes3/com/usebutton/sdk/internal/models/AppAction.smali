.class public Lcom/usebutton/sdk/internal/models/AppAction;
.super Ljava/lang/Object;
.source "AppAction.java"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/usebutton/sdk/internal/models/AppAction$Builder;,
        Lcom/usebutton/sdk/internal/models/AppAction$Listener;
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/usebutton/sdk/internal/models/AppAction;",
            ">;"
        }
    .end annotation
.end field

.field private static final TAG:Ljava/lang/String; = "AppAction"


# instance fields
.field mAuthChallenge:Lcom/usebutton/sdk/internal/models/AuthChallenge;
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation
.end field

.field private final mFooter:Lcom/usebutton/sdk/internal/models/Footer;

.field private final mHeader:Lcom/usebutton/sdk/internal/models/Header;

.field private mLink:Lcom/usebutton/sdk/models/Link;

.field private mListBody:Lcom/usebutton/sdk/models/ListBody;

.field private final mMeta:Lcom/usebutton/sdk/internal/models/MetaInfo;

.field private final mPreview:Lcom/usebutton/sdk/internal/models/Preview;

.field private mProduct:Lcom/usebutton/sdk/internal/models/Product;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 52
    new-instance v0, Lcom/usebutton/sdk/internal/models/AppAction$1;

    invoke-direct {v0}, Lcom/usebutton/sdk/internal/models/AppAction$1;-><init>()V

    sput-object v0, Lcom/usebutton/sdk/internal/models/AppAction;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method protected constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 130
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 131
    const-class v0, Lcom/usebutton/sdk/internal/models/MetaInfo;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/usebutton/sdk/internal/models/MetaInfo;

    iput-object v0, p0, Lcom/usebutton/sdk/internal/models/AppAction;->mMeta:Lcom/usebutton/sdk/internal/models/MetaInfo;

    .line 132
    const-class v0, Lcom/usebutton/sdk/internal/models/Preview;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/usebutton/sdk/internal/models/Preview;

    iput-object v0, p0, Lcom/usebutton/sdk/internal/models/AppAction;->mPreview:Lcom/usebutton/sdk/internal/models/Preview;

    .line 133
    const-class v0, Lcom/usebutton/sdk/internal/models/Header;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/usebutton/sdk/internal/models/Header;

    iput-object v0, p0, Lcom/usebutton/sdk/internal/models/AppAction;->mHeader:Lcom/usebutton/sdk/internal/models/Header;

    .line 134
    const-class v0, Lcom/usebutton/sdk/models/ListBody;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/usebutton/sdk/models/ListBody;

    iput-object v0, p0, Lcom/usebutton/sdk/internal/models/AppAction;->mListBody:Lcom/usebutton/sdk/models/ListBody;

    .line 135
    const-class v0, Lcom/usebutton/sdk/internal/models/Product;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/usebutton/sdk/internal/models/Product;

    iput-object v0, p0, Lcom/usebutton/sdk/internal/models/AppAction;->mProduct:Lcom/usebutton/sdk/internal/models/Product;

    .line 136
    const-class v0, Lcom/usebutton/sdk/internal/models/Footer;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/usebutton/sdk/internal/models/Footer;

    iput-object v0, p0, Lcom/usebutton/sdk/internal/models/AppAction;->mFooter:Lcom/usebutton/sdk/internal/models/Footer;

    .line 137
    const-class v0, Lcom/usebutton/sdk/models/Link;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/usebutton/sdk/models/Link;

    iput-object v0, p0, Lcom/usebutton/sdk/internal/models/AppAction;->mLink:Lcom/usebutton/sdk/models/Link;

    .line 138
    const-class v0, Lcom/usebutton/sdk/internal/models/AuthChallenge;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/usebutton/sdk/internal/models/AuthChallenge;

    iput-object p1, p0, Lcom/usebutton/sdk/internal/models/AppAction;->mAuthChallenge:Lcom/usebutton/sdk/internal/models/AuthChallenge;

    return-void
.end method

.method public constructor <init>(Lcom/usebutton/sdk/internal/models/MetaInfo;Lcom/usebutton/sdk/internal/models/Preview;Lcom/usebutton/sdk/internal/models/AuthChallenge;Lcom/usebutton/sdk/models/Link;)V
    .locals 0

    .line 118
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 119
    iput-object p1, p0, Lcom/usebutton/sdk/internal/models/AppAction;->mMeta:Lcom/usebutton/sdk/internal/models/MetaInfo;

    .line 120
    iput-object p2, p0, Lcom/usebutton/sdk/internal/models/AppAction;->mPreview:Lcom/usebutton/sdk/internal/models/Preview;

    .line 121
    iput-object p3, p0, Lcom/usebutton/sdk/internal/models/AppAction;->mAuthChallenge:Lcom/usebutton/sdk/internal/models/AuthChallenge;

    const/4 p1, 0x0

    .line 122
    iput-object p1, p0, Lcom/usebutton/sdk/internal/models/AppAction;->mHeader:Lcom/usebutton/sdk/internal/models/Header;

    .line 123
    iput-object p1, p0, Lcom/usebutton/sdk/internal/models/AppAction;->mFooter:Lcom/usebutton/sdk/internal/models/Footer;

    .line 124
    iput-object p4, p0, Lcom/usebutton/sdk/internal/models/AppAction;->mLink:Lcom/usebutton/sdk/models/Link;

    return-void
.end method

.method public constructor <init>(Lcom/usebutton/sdk/internal/models/MetaInfo;Lcom/usebutton/sdk/internal/models/Preview;Lcom/usebutton/sdk/internal/models/Header;Lcom/usebutton/sdk/internal/models/Footer;)V
    .locals 0

    .line 97
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 98
    iput-object p1, p0, Lcom/usebutton/sdk/internal/models/AppAction;->mMeta:Lcom/usebutton/sdk/internal/models/MetaInfo;

    .line 99
    iput-object p2, p0, Lcom/usebutton/sdk/internal/models/AppAction;->mPreview:Lcom/usebutton/sdk/internal/models/Preview;

    .line 100
    iput-object p3, p0, Lcom/usebutton/sdk/internal/models/AppAction;->mHeader:Lcom/usebutton/sdk/internal/models/Header;

    .line 101
    iput-object p4, p0, Lcom/usebutton/sdk/internal/models/AppAction;->mFooter:Lcom/usebutton/sdk/internal/models/Footer;

    return-void
.end method

.method public constructor <init>(Lcom/usebutton/sdk/internal/models/MetaInfo;Lcom/usebutton/sdk/internal/models/Preview;Lcom/usebutton/sdk/internal/models/Header;Lcom/usebutton/sdk/internal/models/Product;Lcom/usebutton/sdk/internal/models/Footer;)V
    .locals 0

    .line 89
    invoke-direct {p0, p1, p2, p3, p5}, Lcom/usebutton/sdk/internal/models/AppAction;-><init>(Lcom/usebutton/sdk/internal/models/MetaInfo;Lcom/usebutton/sdk/internal/models/Preview;Lcom/usebutton/sdk/internal/models/Header;Lcom/usebutton/sdk/internal/models/Footer;)V

    .line 90
    iput-object p4, p0, Lcom/usebutton/sdk/internal/models/AppAction;->mProduct:Lcom/usebutton/sdk/internal/models/Product;

    return-void
.end method

.method public constructor <init>(Lcom/usebutton/sdk/internal/models/MetaInfo;Lcom/usebutton/sdk/internal/models/Preview;Lcom/usebutton/sdk/internal/models/Header;Lcom/usebutton/sdk/models/ListBody;Lcom/usebutton/sdk/internal/models/Footer;)V
    .locals 0

    .line 80
    invoke-direct {p0, p1, p2, p3, p5}, Lcom/usebutton/sdk/internal/models/AppAction;-><init>(Lcom/usebutton/sdk/internal/models/MetaInfo;Lcom/usebutton/sdk/internal/models/Preview;Lcom/usebutton/sdk/internal/models/Header;Lcom/usebutton/sdk/internal/models/Footer;)V

    .line 81
    iput-object p4, p0, Lcom/usebutton/sdk/internal/models/AppAction;->mListBody:Lcom/usebutton/sdk/models/ListBody;

    return-void
.end method

.method public constructor <init>(Lcom/usebutton/sdk/internal/models/MetaInfo;Lcom/usebutton/sdk/models/Link;)V
    .locals 0

    .line 107
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 108
    iput-object p1, p0, Lcom/usebutton/sdk/internal/models/AppAction;->mMeta:Lcom/usebutton/sdk/internal/models/MetaInfo;

    .line 109
    iput-object p2, p0, Lcom/usebutton/sdk/internal/models/AppAction;->mLink:Lcom/usebutton/sdk/models/Link;

    const/4 p1, 0x0

    .line 110
    iput-object p1, p0, Lcom/usebutton/sdk/internal/models/AppAction;->mPreview:Lcom/usebutton/sdk/internal/models/Preview;

    .line 111
    iput-object p1, p0, Lcom/usebutton/sdk/internal/models/AppAction;->mHeader:Lcom/usebutton/sdk/internal/models/Header;

    .line 112
    iput-object p1, p0, Lcom/usebutton/sdk/internal/models/AppAction;->mFooter:Lcom/usebutton/sdk/internal/models/Footer;

    return-void
.end method

.method static synthetic access$000(Lcom/usebutton/sdk/internal/models/AppAction;)V
    .locals 0

    .line 42
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/models/AppAction;->trackTapEvent()V

    return-void
.end method

.method static synthetic access$100(Lcom/usebutton/sdk/internal/models/AppAction;)Lcom/usebutton/sdk/internal/models/MetaInfo;
    .locals 0

    .line 42
    iget-object p0, p0, Lcom/usebutton/sdk/internal/models/AppAction;->mMeta:Lcom/usebutton/sdk/internal/models/MetaInfo;

    return-object p0
.end method

.method static synthetic access$200(Lcom/usebutton/sdk/internal/models/AppAction;Landroid/content/Context;ILcom/usebutton/sdk/internal/models/AppAction$Listener;)V
    .locals 0

    .line 42
    invoke-direct {p0, p1, p2, p3}, Lcom/usebutton/sdk/internal/models/AppAction;->invokeActionInternal(Landroid/content/Context;ILcom/usebutton/sdk/internal/models/AppAction$Listener;)V

    return-void
.end method

.method private doInvokeInventory(Landroid/content/Context;Lcom/usebutton/sdk/models/Inventory;I)V
    .locals 2

    .line 434
    new-instance v0, Lcom/usebutton/sdk/internal/ActionPerformer;

    iget-object v1, p0, Lcom/usebutton/sdk/internal/models/AppAction;->mMeta:Lcom/usebutton/sdk/internal/models/MetaInfo;

    invoke-virtual {p2}, Lcom/usebutton/sdk/models/Inventory;->getAction()Lcom/usebutton/sdk/models/Link;

    move-result-object p2

    invoke-direct {v0, v1, p2, p3}, Lcom/usebutton/sdk/internal/ActionPerformer;-><init>(Lcom/usebutton/sdk/internal/models/MetaInfo;Lcom/usebutton/sdk/models/Link;I)V

    const-string p2, "btn:custom-item-tapped"

    .line 435
    invoke-virtual {v0, p2}, Lcom/usebutton/sdk/internal/ActionPerformer;->withEvent(Ljava/lang/String;)Lcom/usebutton/sdk/internal/ActionPerformer;

    move-result-object p2

    .line 436
    invoke-virtual {p2, p1}, Lcom/usebutton/sdk/internal/ActionPerformer;->execute(Landroid/content/Context;)V

    return-void
.end method

.method public static fromDTO(Lcom/usebutton/sdk/internal/api/models/AppActionDTO;)Lcom/usebutton/sdk/internal/models/AppAction;
    .locals 4
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 149
    :cond_0
    iget-object v0, p0, Lcom/usebutton/sdk/internal/api/models/AppActionDTO;->mMeta:Lcom/usebutton/sdk/internal/api/models/MetaDTO;

    iget-object v0, v0, Lcom/usebutton/sdk/internal/api/models/MetaDTO;->appIcon:Lcom/usebutton/sdk/internal/api/models/ImageDTO;

    invoke-static {v0}, Lcom/usebutton/sdk/internal/models/Asset;->fromDTO(Lcom/usebutton/sdk/internal/api/models/ImageDTO;)Lcom/usebutton/sdk/internal/models/Asset;

    move-result-object v0

    .line 150
    new-instance v1, Lcom/usebutton/sdk/internal/models/AppAction$Builder;

    invoke-direct {v1}, Lcom/usebutton/sdk/internal/models/AppAction$Builder;-><init>()V

    iget-object v2, p0, Lcom/usebutton/sdk/internal/api/models/AppActionDTO;->mMeta:Lcom/usebutton/sdk/internal/api/models/MetaDTO;

    iget-object v2, v2, Lcom/usebutton/sdk/internal/api/models/MetaDTO;->sourceToken:Ljava/lang/String;

    .line 151
    invoke-virtual {v1, v2}, Lcom/usebutton/sdk/internal/models/AppAction$Builder;->withSourceToken(Ljava/lang/String;)Lcom/usebutton/sdk/internal/models/AppAction$Builder;

    move-result-object v1

    iget-object v2, p0, Lcom/usebutton/sdk/internal/api/models/AppActionDTO;->mMeta:Lcom/usebutton/sdk/internal/api/models/MetaDTO;

    iget-object v2, v2, Lcom/usebutton/sdk/internal/api/models/MetaDTO;->requestTime:Ljava/lang/String;

    .line 152
    invoke-virtual {v1, v2}, Lcom/usebutton/sdk/internal/models/AppAction$Builder;->withRequestTime(Ljava/lang/String;)Lcom/usebutton/sdk/internal/models/AppAction$Builder;

    move-result-object v1

    iget-object v2, p0, Lcom/usebutton/sdk/internal/api/models/AppActionDTO;->mMeta:Lcom/usebutton/sdk/internal/api/models/MetaDTO;

    iget-object v2, v2, Lcom/usebutton/sdk/internal/api/models/MetaDTO;->id:Ljava/lang/String;

    .line 153
    invoke-virtual {v1, v2}, Lcom/usebutton/sdk/internal/models/AppAction$Builder;->withId(Ljava/lang/String;)Lcom/usebutton/sdk/internal/models/AppAction$Builder;

    move-result-object v1

    iget-object v2, p0, Lcom/usebutton/sdk/internal/api/models/AppActionDTO;->mMeta:Lcom/usebutton/sdk/internal/api/models/MetaDTO;

    iget-object v2, v2, Lcom/usebutton/sdk/internal/api/models/MetaDTO;->storeId:Ljava/lang/String;

    .line 154
    invoke-virtual {v1, v2}, Lcom/usebutton/sdk/internal/models/AppAction$Builder;->withStoreId(Ljava/lang/String;)Lcom/usebutton/sdk/internal/models/AppAction$Builder;

    move-result-object v1

    iget-object v2, p0, Lcom/usebutton/sdk/internal/api/models/AppActionDTO;->mMeta:Lcom/usebutton/sdk/internal/api/models/MetaDTO;

    iget v2, v2, Lcom/usebutton/sdk/internal/api/models/MetaDTO;->maxAgeSeconds:I

    .line 155
    invoke-virtual {v1, v2}, Lcom/usebutton/sdk/internal/models/AppAction$Builder;->withMaxAgeSeconds(I)Lcom/usebutton/sdk/internal/models/AppAction$Builder;

    move-result-object v1

    iget-object v2, p0, Lcom/usebutton/sdk/internal/api/models/AppActionDTO;->mMeta:Lcom/usebutton/sdk/internal/api/models/MetaDTO;

    iget-object v2, v2, Lcom/usebutton/sdk/internal/api/models/MetaDTO;->appName:Ljava/lang/String;

    .line 156
    invoke-virtual {v1, v2}, Lcom/usebutton/sdk/internal/models/AppAction$Builder;->withAppName(Ljava/lang/String;)Lcom/usebutton/sdk/internal/models/AppAction$Builder;

    move-result-object v1

    iget-object v2, p0, Lcom/usebutton/sdk/internal/api/models/AppActionDTO;->mMeta:Lcom/usebutton/sdk/internal/api/models/MetaDTO;

    iget-object v2, v2, Lcom/usebutton/sdk/internal/api/models/MetaDTO;->target:Ljava/lang/String;

    .line 157
    invoke-virtual {v1, v2}, Lcom/usebutton/sdk/internal/models/AppAction$Builder;->withTarget(Ljava/lang/String;)Lcom/usebutton/sdk/internal/models/AppAction$Builder;

    move-result-object v1

    iget-object v2, p0, Lcom/usebutton/sdk/internal/api/models/AppActionDTO;->mMeta:Lcom/usebutton/sdk/internal/api/models/MetaDTO;

    iget-object v2, v2, Lcom/usebutton/sdk/internal/api/models/MetaDTO;->tapSignal:Ljava/lang/String;

    .line 158
    invoke-virtual {v1, v2}, Lcom/usebutton/sdk/internal/models/AppAction$Builder;->withTapSignal(Ljava/lang/String;)Lcom/usebutton/sdk/internal/models/AppAction$Builder;

    move-result-object v1

    iget-object v2, p0, Lcom/usebutton/sdk/internal/api/models/AppActionDTO;->mPreview:Lcom/usebutton/sdk/internal/api/models/PreviewDTO;

    .line 159
    invoke-static {v2}, Lcom/usebutton/sdk/internal/models/Preview;->fromDTO(Lcom/usebutton/sdk/internal/api/models/PreviewDTO;)Lcom/usebutton/sdk/internal/models/Preview;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/usebutton/sdk/internal/models/AppAction$Builder;->withPreview(Lcom/usebutton/sdk/internal/models/Preview;)Lcom/usebutton/sdk/internal/models/AppAction$Builder;

    move-result-object v1

    iget-object v2, p0, Lcom/usebutton/sdk/internal/api/models/AppActionDTO;->mHeader:Lcom/usebutton/sdk/internal/api/models/HeaderDTO;

    .line 160
    invoke-static {v2}, Lcom/usebutton/sdk/internal/models/Header;->fromDTO(Lcom/usebutton/sdk/internal/api/models/HeaderDTO;)Lcom/usebutton/sdk/internal/models/Header;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/usebutton/sdk/internal/models/AppAction$Builder;->withHeader(Lcom/usebutton/sdk/internal/models/Header;)Lcom/usebutton/sdk/internal/models/AppAction$Builder;

    move-result-object v1

    iget-object v2, p0, Lcom/usebutton/sdk/internal/api/models/AppActionDTO;->mFooter:Lcom/usebutton/sdk/internal/api/models/FooterDTO;

    .line 161
    invoke-static {v2}, Lcom/usebutton/sdk/internal/models/Footer;->fromDTO(Lcom/usebutton/sdk/internal/api/models/FooterDTO;)Lcom/usebutton/sdk/internal/models/Footer;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/usebutton/sdk/internal/models/AppAction$Builder;->withFooter(Lcom/usebutton/sdk/internal/models/Footer;)Lcom/usebutton/sdk/internal/models/AppAction$Builder;

    move-result-object v1

    iget-object v2, p0, Lcom/usebutton/sdk/internal/api/models/AppActionDTO;->mAuthChallenge:Lcom/usebutton/sdk/internal/api/models/AuthChallengeDTO;

    .line 162
    invoke-static {v2}, Lcom/usebutton/sdk/internal/models/AuthChallenge;->fromDTO(Lcom/usebutton/sdk/internal/api/models/AuthChallengeDTO;)Lcom/usebutton/sdk/internal/models/AuthChallenge;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/usebutton/sdk/internal/models/AppAction$Builder;->withAuthChallenge(Lcom/usebutton/sdk/internal/models/AuthChallenge;)Lcom/usebutton/sdk/internal/models/AppAction$Builder;

    move-result-object v1

    iget-object v2, p0, Lcom/usebutton/sdk/internal/api/models/AppActionDTO;->mLinks:Lcom/usebutton/sdk/internal/api/models/LinkDTO;

    .line 163
    invoke-static {v2}, Lcom/usebutton/sdk/models/Link;->fromDTO(Lcom/usebutton/sdk/internal/api/models/LinkDTO;)Lcom/usebutton/sdk/models/Link;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/usebutton/sdk/internal/models/AppAction$Builder;->withAffiliatedLink(Lcom/usebutton/sdk/models/Link;)Lcom/usebutton/sdk/internal/models/AppAction$Builder;

    move-result-object v1

    .line 164
    invoke-virtual {v1, v0}, Lcom/usebutton/sdk/internal/models/AppAction$Builder;->withAppIcon(Lcom/usebutton/sdk/internal/models/Asset;)Lcom/usebutton/sdk/internal/models/AppAction$Builder;

    move-result-object v0

    .line 165
    iget-object v1, p0, Lcom/usebutton/sdk/internal/api/models/AppActionDTO;->mBrowser:Lcom/usebutton/sdk/internal/api/models/BrowserDTO;

    if-eqz v1, :cond_1

    .line 166
    iget-object v1, p0, Lcom/usebutton/sdk/internal/api/models/AppActionDTO;->mBrowser:Lcom/usebutton/sdk/internal/api/models/BrowserDTO;

    iget-object v2, p0, Lcom/usebutton/sdk/internal/api/models/AppActionDTO;->mMeta:Lcom/usebutton/sdk/internal/api/models/MetaDTO;

    iget-object v2, v2, Lcom/usebutton/sdk/internal/api/models/MetaDTO;->target:Ljava/lang/String;

    iget-object v3, p0, Lcom/usebutton/sdk/internal/api/models/AppActionDTO;->mMeta:Lcom/usebutton/sdk/internal/api/models/MetaDTO;

    iget-object v3, v3, Lcom/usebutton/sdk/internal/api/models/MetaDTO;->appName:Ljava/lang/String;

    invoke-static {v1, v2, v3}, Lcom/usebutton/sdk/internal/models/Browser;->fromDTO(Lcom/usebutton/sdk/internal/api/models/BrowserDTO;Ljava/lang/String;Ljava/lang/String;)Lcom/usebutton/sdk/internal/models/Browser;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/usebutton/sdk/internal/models/AppAction$Builder;->withBrowser(Lcom/usebutton/sdk/internal/models/Browser;)Lcom/usebutton/sdk/internal/models/AppAction$Builder;

    :cond_1
    const-string v1, "list"

    .line 168
    iget-object v2, p0, Lcom/usebutton/sdk/internal/api/models/AppActionDTO;->mType:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 169
    iget-object p0, p0, Lcom/usebutton/sdk/internal/api/models/AppActionDTO;->mList:Lcom/usebutton/sdk/internal/api/models/BodyDTO$ListDTO;

    invoke-static {p0}, Lcom/usebutton/sdk/models/ListBody;->fromDTO(Lcom/usebutton/sdk/internal/api/models/BodyDTO$ListDTO;)Lcom/usebutton/sdk/models/ListBody;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/usebutton/sdk/internal/models/AppAction$Builder;->withListBody(Lcom/usebutton/sdk/models/ListBody;)Lcom/usebutton/sdk/internal/models/AppAction$Builder;

    goto :goto_0

    :cond_2
    const-string v1, "product"

    .line 170
    iget-object v2, p0, Lcom/usebutton/sdk/internal/api/models/AppActionDTO;->mType:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 171
    iget-object p0, p0, Lcom/usebutton/sdk/internal/api/models/AppActionDTO;->mProduct:Lcom/usebutton/sdk/internal/api/models/BodyDTO$ProductDTO;

    invoke-static {p0}, Lcom/usebutton/sdk/internal/models/Product;->fromDTO(Lcom/usebutton/sdk/internal/api/models/BodyDTO$ProductDTO;)Lcom/usebutton/sdk/internal/models/Product;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/usebutton/sdk/internal/models/AppAction$Builder;->withProduct(Lcom/usebutton/sdk/internal/models/Product;)Lcom/usebutton/sdk/internal/models/AppAction$Builder;

    .line 173
    :cond_3
    :goto_0
    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/models/AppAction$Builder;->build()Lcom/usebutton/sdk/internal/models/AppAction;

    move-result-object p0

    return-object p0
.end method

.method private handleAuthChallenge(Landroid/content/Context;ILcom/usebutton/sdk/internal/models/AppAction$Listener;)V
    .locals 2
    .param p3    # Lcom/usebutton/sdk/internal/models/AppAction$Listener;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 476
    invoke-static {}, Lcom/usebutton/sdk/internal/AuthChallengeObserver;->getInstance()Lcom/usebutton/sdk/internal/AuthChallengeObserver;

    move-result-object v0

    new-instance v1, Lcom/usebutton/sdk/internal/models/AppAction$2;

    invoke-direct {v1, p0, p2, p1, p3}, Lcom/usebutton/sdk/internal/models/AppAction$2;-><init>(Lcom/usebutton/sdk/internal/models/AppAction;ILandroid/content/Context;Lcom/usebutton/sdk/internal/models/AppAction$Listener;)V

    .line 477
    invoke-virtual {v0, v1}, Lcom/usebutton/sdk/internal/AuthChallengeObserver;->setListener(Lcom/usebutton/sdk/internal/AuthChallengeObserver$AuthChallengeListener;)V

    .line 492
    invoke-direct {p0, p1}, Lcom/usebutton/sdk/internal/models/AppAction;->startAuthChallenge(Landroid/content/Context;)V

    return-void
.end method

.method private invokeActionInternal(Landroid/content/Context;ILcom/usebutton/sdk/internal/models/AppAction$Listener;)V
    .locals 3
    .param p3    # Lcom/usebutton/sdk/internal/models/AppAction$Listener;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 507
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/AppAction;->mLink:Lcom/usebutton/sdk/models/Link;

    if-nez v0, :cond_0

    .line 508
    invoke-virtual {p0, p1, p2}, Lcom/usebutton/sdk/internal/models/AppAction;->doInvokePreview(Landroid/content/Context;I)V

    return-void

    .line 511
    :cond_0
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/models/AppAction;->trackTapEvent()V

    .line 514
    new-instance v0, Lcom/usebutton/sdk/internal/ActionPerformer;

    iget-object v1, p0, Lcom/usebutton/sdk/internal/models/AppAction;->mMeta:Lcom/usebutton/sdk/internal/models/MetaInfo;

    iget-object v2, p0, Lcom/usebutton/sdk/internal/models/AppAction;->mLink:Lcom/usebutton/sdk/models/Link;

    invoke-direct {v0, v1, v2, p2}, Lcom/usebutton/sdk/internal/ActionPerformer;-><init>(Lcom/usebutton/sdk/internal/models/MetaInfo;Lcom/usebutton/sdk/models/Link;I)V

    invoke-virtual {v0, p1, p3}, Lcom/usebutton/sdk/internal/ActionPerformer;->execute(Landroid/content/Context;Lcom/usebutton/sdk/internal/models/AppAction$Listener;)V

    return-void
.end method

.method private startAuthChallenge(Landroid/content/Context;)V
    .locals 3

    .line 499
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/AppAction;->mAuthChallenge:Lcom/usebutton/sdk/internal/models/AuthChallenge;

    iget-object v1, p0, Lcom/usebutton/sdk/internal/models/AppAction;->mMeta:Lcom/usebutton/sdk/internal/models/MetaInfo;

    const/high16 v2, 0x10000000

    invoke-static {p1, v0, v1, v2}, Lcom/usebutton/sdk/internal/AuthChallengeActivity;->createIntent(Landroid/content/Context;Lcom/usebutton/sdk/internal/models/AuthChallenge;Lcom/usebutton/sdk/internal/models/MetaInfo;I)Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method private trackTapEvent()V
    .locals 5

    .line 518
    invoke-static {}, Lcom/usebutton/sdk/internal/ButtonPrivate;->getButton()Lcom/usebutton/sdk/internal/ButtonPrivate;

    move-result-object v0

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/ButtonPrivate;->getEventTracker()Lcom/usebutton/sdk/internal/events/EventTracker;

    move-result-object v0

    const-string v1, "btn:button-tapped"

    const/4 v2, 0x4

    .line 519
    new-array v2, v2, [Ljava/lang/String;

    const-string v3, "promotion_source_token"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    .line 520
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/models/AppAction;->getMeta()Lcom/usebutton/sdk/internal/models/MetaInfo;

    move-result-object v3

    invoke-virtual {v3}, Lcom/usebutton/sdk/internal/models/MetaInfo;->getSourceToken()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    const-string v3, "type"

    const/4 v4, 0x2

    aput-object v3, v2, v4

    const-string v3, "custom"

    const/4 v4, 0x3

    aput-object v3, v2, v4

    .line 519
    invoke-virtual {v0, v1, v2}, Lcom/usebutton/sdk/internal/events/EventTracker;->trackEventWithProperties(Ljava/lang/String;[Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method doInvokeFooter(Landroid/content/Context;I)V
    .locals 3

    .line 443
    new-instance v0, Lcom/usebutton/sdk/internal/ActionPerformer;

    iget-object v1, p0, Lcom/usebutton/sdk/internal/models/AppAction;->mMeta:Lcom/usebutton/sdk/internal/models/MetaInfo;

    iget-object v2, p0, Lcom/usebutton/sdk/internal/models/AppAction;->mFooter:Lcom/usebutton/sdk/internal/models/Footer;

    invoke-virtual {v2}, Lcom/usebutton/sdk/internal/models/Footer;->getAction()Lcom/usebutton/sdk/models/Link;

    move-result-object v2

    invoke-direct {v0, v1, v2, p2}, Lcom/usebutton/sdk/internal/ActionPerformer;-><init>(Lcom/usebutton/sdk/internal/models/MetaInfo;Lcom/usebutton/sdk/models/Link;I)V

    const-string p2, "btn:custom-item-tapped"

    .line 444
    invoke-virtual {v0, p2}, Lcom/usebutton/sdk/internal/ActionPerformer;->withEvent(Ljava/lang/String;)Lcom/usebutton/sdk/internal/ActionPerformer;

    move-result-object p2

    .line 445
    invoke-virtual {p2, p1}, Lcom/usebutton/sdk/internal/ActionPerformer;->execute(Landroid/content/Context;)V

    return-void
.end method

.method public doInvokePreview(Landroid/content/Context;I)V
    .locals 5

    .line 373
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/AppAction;->mPreview:Lcom/usebutton/sdk/internal/models/Preview;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_0

    const-string p1, "Unable to invoke preview for action. Use invokeAction() instead."

    .line 374
    invoke-static {p1}, Lcom/usebutton/sdk/internal/util/ButtonLog;->visible(Ljava/lang/String;)V

    const-string p1, "AppAction"

    const-string p2, "Unable to invoke preview for action: %s "

    .line 375
    new-array v0, v2, [Ljava/lang/Object;

    aput-object p0, v0, v1

    invoke-static {p1, p2, v0}, Lcom/usebutton/sdk/internal/util/ButtonLog;->warnFormat(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_0
    const-string v0, "Button tapped (Action ID: %s)"

    .line 379
    new-array v3, v2, [Ljava/lang/Object;

    iget-object v4, p0, Lcom/usebutton/sdk/internal/models/AppAction;->mMeta:Lcom/usebutton/sdk/internal/models/MetaInfo;

    invoke-virtual {v4}, Lcom/usebutton/sdk/internal/models/MetaInfo;->getId()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v3, v1

    invoke-static {v0, v3}, Lcom/usebutton/sdk/internal/util/ButtonLog;->visibleFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 381
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/models/AppAction;->trackTapEvent()V

    .line 384
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/AppAction;->mPreview:Lcom/usebutton/sdk/internal/models/Preview;

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/models/Preview;->hasAction()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 385
    new-instance v0, Lcom/usebutton/sdk/internal/ActionPerformer;

    iget-object v1, p0, Lcom/usebutton/sdk/internal/models/AppAction;->mMeta:Lcom/usebutton/sdk/internal/models/MetaInfo;

    iget-object v2, p0, Lcom/usebutton/sdk/internal/models/AppAction;->mPreview:Lcom/usebutton/sdk/internal/models/Preview;

    invoke-virtual {v2}, Lcom/usebutton/sdk/internal/models/Preview;->getDeepLinks()Lcom/usebutton/sdk/models/Link;

    move-result-object v2

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, p2, v3}, Lcom/usebutton/sdk/internal/ActionPerformer;-><init>(Lcom/usebutton/sdk/internal/models/MetaInfo;Lcom/usebutton/sdk/models/Link;ILcom/usebutton/sdk/internal/models/AuthChallenge;)V

    .line 386
    invoke-virtual {v0, p1}, Lcom/usebutton/sdk/internal/ActionPerformer;->execute(Landroid/content/Context;)V

    return-void

    .line 388
    :cond_1
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/models/AppAction;->hasGroups()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 389
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/AppAction;->mMeta:Lcom/usebutton/sdk/internal/models/MetaInfo;

    iget-object v1, p0, Lcom/usebutton/sdk/internal/models/AppAction;->mHeader:Lcom/usebutton/sdk/internal/models/Header;

    iget-object v2, p0, Lcom/usebutton/sdk/internal/models/AppAction;->mListBody:Lcom/usebutton/sdk/models/ListBody;

    iget-object v3, p0, Lcom/usebutton/sdk/internal/models/AppAction;->mFooter:Lcom/usebutton/sdk/internal/models/Footer;

    invoke-static {p1, v0, v1, v2, v3}, Lcom/usebutton/sdk/internal/GroupedInventoryCardActivity;->intentForPromotion(Landroid/content/Context;Lcom/usebutton/sdk/internal/models/MetaInfo;Lcom/usebutton/sdk/internal/models/Header;Lcom/usebutton/sdk/models/ListBody;Lcom/usebutton/sdk/internal/models/Footer;)Landroid/content/Intent;

    move-result-object v0

    goto :goto_0

    .line 391
    :cond_2
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/models/AppAction;->hasProduct()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 392
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/AppAction;->mMeta:Lcom/usebutton/sdk/internal/models/MetaInfo;

    .line 393
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/models/AppAction;->getProduct()Lcom/usebutton/sdk/internal/models/Product;

    move-result-object v1

    iget-object v2, p0, Lcom/usebutton/sdk/internal/models/AppAction;->mFooter:Lcom/usebutton/sdk/internal/models/Footer;

    .line 392
    invoke-static {p1, v0, v1, v2}, Lcom/usebutton/sdk/internal/SingleProductCardActivity;->intentForPromotion(Landroid/content/Context;Lcom/usebutton/sdk/internal/models/MetaInfo;Lcom/usebutton/sdk/internal/models/Product;Lcom/usebutton/sdk/internal/models/Footer;)Landroid/content/Intent;

    move-result-object v0

    :goto_0
    const-string v1, "flags"

    .line 398
    invoke-virtual {v0, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 399
    invoke-virtual {p1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void

    :cond_3
    const-string p1, "AppAction"

    const-string p2, "Don\'t know how to invoke preview: %s"

    .line 395
    new-array v0, v2, [Ljava/lang/Object;

    aput-object p0, v0, v1

    invoke-static {p1, p2, v0}, Lcom/usebutton/sdk/internal/util/ButtonLog;->warnFormat(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public getFooter()Lcom/usebutton/sdk/internal/models/Footer;
    .locals 1

    .line 197
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/AppAction;->mFooter:Lcom/usebutton/sdk/internal/models/Footer;

    return-object v0
.end method

.method public getHeader()Lcom/usebutton/sdk/internal/models/Header;
    .locals 1

    .line 189
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/AppAction;->mHeader:Lcom/usebutton/sdk/internal/models/Header;

    return-object v0
.end method

.method public getLink()Lcom/usebutton/sdk/models/Link;
    .locals 1

    .line 218
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/AppAction;->mLink:Lcom/usebutton/sdk/models/Link;

    return-object v0
.end method

.method public getListBody()Lcom/usebutton/sdk/models/ListBody;
    .locals 1

    .line 193
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/AppAction;->mListBody:Lcom/usebutton/sdk/models/ListBody;

    return-object v0
.end method

.method public getMeta()Lcom/usebutton/sdk/internal/models/MetaInfo;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 210
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/AppAction;->mMeta:Lcom/usebutton/sdk/internal/models/MetaInfo;

    return-object v0
.end method

.method public getPreview()Lcom/usebutton/sdk/internal/models/Preview;
    .locals 1

    .line 185
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/AppAction;->mPreview:Lcom/usebutton/sdk/internal/models/Preview;

    return-object v0
.end method

.method public getProduct()Lcom/usebutton/sdk/internal/models/Product;
    .locals 1

    .line 214
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/AppAction;->mProduct:Lcom/usebutton/sdk/internal/models/Product;

    return-object v0
.end method

.method public hasGroups()Z
    .locals 1

    .line 201
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/AppAction;->mListBody:Lcom/usebutton/sdk/models/ListBody;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public hasProduct()Z
    .locals 1

    .line 205
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/AppAction;->mProduct:Lcom/usebutton/sdk/internal/models/Product;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public invokeAction(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 452
    invoke-virtual {p0, p1, v0}, Lcom/usebutton/sdk/internal/models/AppAction;->invokeAction(Landroid/content/Context;Lcom/usebutton/sdk/internal/models/AppAction$Listener;)V

    return-void
.end method

.method public invokeAction(Landroid/content/Context;Lcom/usebutton/sdk/internal/models/AppAction$Listener;)V
    .locals 1
    .param p2    # Lcom/usebutton/sdk/internal/models/AppAction$Listener;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 460
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/AppAction;->mAuthChallenge:Lcom/usebutton/sdk/internal/models/AuthChallenge;

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 461
    invoke-direct {p0, p1, v0, p2}, Lcom/usebutton/sdk/internal/models/AppAction;->handleAuthChallenge(Landroid/content/Context;ILcom/usebutton/sdk/internal/models/AppAction$Listener;)V

    goto :goto_0

    :cond_0
    const/high16 v0, 0x10000000

    .line 463
    invoke-direct {p0, p1, v0, p2}, Lcom/usebutton/sdk/internal/models/AppAction;->invokeActionInternal(Landroid/content/Context;ILcom/usebutton/sdk/internal/models/AppAction$Listener;)V

    :goto_0
    return-void
.end method

.method public invokeInventory(Landroid/content/Context;Lcom/usebutton/sdk/models/Inventory;)V
    .locals 1

    if-eqz p2, :cond_0

    const/high16 v0, 0x10000000

    .line 426
    invoke-direct {p0, p1, p2, v0}, Lcom/usebutton/sdk/internal/models/AppAction;->doInvokeInventory(Landroid/content/Context;Lcom/usebutton/sdk/models/Inventory;I)V

    return-void

    .line 424
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Null inventory, can\'t invoke"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setLink(Lcom/usebutton/sdk/models/Link;)V
    .locals 0

    .line 468
    iput-object p1, p0, Lcom/usebutton/sdk/internal/models/AppAction;->mLink:Lcom/usebutton/sdk/models/Link;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 527
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "AppAction{mMeta="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/usebutton/sdk/internal/models/AppAction;->mMeta:Lcom/usebutton/sdk/internal/models/MetaInfo;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mPreview="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/usebutton/sdk/internal/models/AppAction;->mPreview:Lcom/usebutton/sdk/internal/models/Preview;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mHeader="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/usebutton/sdk/internal/models/AppAction;->mHeader:Lcom/usebutton/sdk/internal/models/Header;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mFooter="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/usebutton/sdk/internal/models/AppAction;->mFooter:Lcom/usebutton/sdk/internal/models/Footer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mProduct="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/usebutton/sdk/internal/models/AppAction;->mProduct:Lcom/usebutton/sdk/internal/models/Product;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mListBody="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/usebutton/sdk/internal/models/AppAction;->mListBody:Lcom/usebutton/sdk/models/ListBody;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mLink="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/usebutton/sdk/internal/models/AppAction;->mLink:Lcom/usebutton/sdk/models/Link;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mAuthChallenge="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/usebutton/sdk/internal/models/AppAction;->mAuthChallenge:Lcom/usebutton/sdk/internal/models/AuthChallenge;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public trackButtonViewed(Landroid/content/Context;)V
    .locals 6

    .line 410
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/models/AppAction;->getMeta()Lcom/usebutton/sdk/internal/models/MetaInfo;

    move-result-object p1

    const-string v0, "Custom button viewed (Action ID: %s)"

    const/4 v1, 0x1

    .line 411
    new-array v2, v1, [Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/models/MetaInfo;->getId()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v0, v2}, Lcom/usebutton/sdk/internal/util/ButtonLog;->visibleFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 413
    invoke-static {}, Lcom/usebutton/sdk/internal/ButtonPrivate;->getButton()Lcom/usebutton/sdk/internal/ButtonPrivate;

    move-result-object v0

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/ButtonPrivate;->getEventTracker()Lcom/usebutton/sdk/internal/events/EventTracker;

    move-result-object v0

    const-string v2, "btn:custom-button-viewed"

    const/4 v3, 0x2

    .line 414
    new-array v3, v3, [Ljava/lang/String;

    const-string v5, "promotion_source_token"

    aput-object v5, v3, v4

    .line 415
    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/models/MetaInfo;->getSourceToken()Ljava/lang/String;

    move-result-object p1

    aput-object p1, v3, v1

    .line 414
    invoke-virtual {v0, v2, v3}, Lcom/usebutton/sdk/internal/events/EventTracker;->trackEventWithProperties(Ljava/lang/String;[Ljava/lang/String;)V

    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 234
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/AppAction;->mMeta:Lcom/usebutton/sdk/internal/models/MetaInfo;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 235
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/AppAction;->mPreview:Lcom/usebutton/sdk/internal/models/Preview;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 236
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/AppAction;->mHeader:Lcom/usebutton/sdk/internal/models/Header;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 237
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/AppAction;->mListBody:Lcom/usebutton/sdk/models/ListBody;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 238
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/AppAction;->mProduct:Lcom/usebutton/sdk/internal/models/Product;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 239
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/AppAction;->mFooter:Lcom/usebutton/sdk/internal/models/Footer;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 240
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/AppAction;->mLink:Lcom/usebutton/sdk/models/Link;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 241
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/AppAction;->mAuthChallenge:Lcom/usebutton/sdk/internal/models/AuthChallenge;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    return-void
.end method
