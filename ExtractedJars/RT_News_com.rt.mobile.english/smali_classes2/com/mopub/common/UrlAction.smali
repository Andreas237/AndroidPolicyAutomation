.class public abstract enum Lcom/mopub/common/UrlAction;
.super Ljava/lang/Enum;
.source "UrlAction.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/mopub/common/UrlAction;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/mopub/common/UrlAction;

.field public static final enum FOLLOW_DEEP_LINK:Lcom/mopub/common/UrlAction;

.field public static final enum FOLLOW_DEEP_LINK_WITH_FALLBACK:Lcom/mopub/common/UrlAction;

.field public static final enum HANDLE_MOPUB_SCHEME:Lcom/mopub/common/UrlAction;

.field public static final enum HANDLE_PHONE_SCHEME:Lcom/mopub/common/UrlAction;

.field public static final enum HANDLE_SHARE_TWEET:Lcom/mopub/common/UrlAction;

.field public static final enum IGNORE_ABOUT_SCHEME:Lcom/mopub/common/UrlAction;

.field public static final enum NOOP:Lcom/mopub/common/UrlAction;

.field public static final enum OPEN_APP_MARKET:Lcom/mopub/common/UrlAction;

.field public static final enum OPEN_IN_APP_BROWSER:Lcom/mopub/common/UrlAction;

.field public static final enum OPEN_NATIVE_BROWSER:Lcom/mopub/common/UrlAction;


# instance fields
.field private final mRequiresUserInteraction:Z


# direct methods
.method static constructor <clinit>()V
    .locals 12

    .line 35
    new-instance v0, Lcom/mopub/common/UrlAction$1;

    const-string v1, "HANDLE_MOPUB_SCHEME"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lcom/mopub/common/UrlAction$1;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Lcom/mopub/common/UrlAction;->HANDLE_MOPUB_SCHEME:Lcom/mopub/common/UrlAction;

    .line 63
    new-instance v0, Lcom/mopub/common/UrlAction$2;

    const-string v1, "IGNORE_ABOUT_SCHEME"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3, v2}, Lcom/mopub/common/UrlAction$2;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Lcom/mopub/common/UrlAction;->IGNORE_ABOUT_SCHEME:Lcom/mopub/common/UrlAction;

    .line 79
    new-instance v0, Lcom/mopub/common/UrlAction$3;

    const-string v1, "HANDLE_PHONE_SCHEME"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4, v3}, Lcom/mopub/common/UrlAction$3;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Lcom/mopub/common/UrlAction;->HANDLE_PHONE_SCHEME:Lcom/mopub/common/UrlAction;

    .line 101
    new-instance v0, Lcom/mopub/common/UrlAction$4;

    const-string v1, "OPEN_NATIVE_BROWSER"

    const/4 v5, 0x3

    invoke-direct {v0, v1, v5, v3}, Lcom/mopub/common/UrlAction$4;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Lcom/mopub/common/UrlAction;->OPEN_NATIVE_BROWSER:Lcom/mopub/common/UrlAction;

    .line 123
    new-instance v0, Lcom/mopub/common/UrlAction$5;

    const-string v1, "OPEN_APP_MARKET"

    const/4 v6, 0x4

    invoke-direct {v0, v1, v6, v3}, Lcom/mopub/common/UrlAction$5;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Lcom/mopub/common/UrlAction;->OPEN_APP_MARKET:Lcom/mopub/common/UrlAction;

    .line 146
    new-instance v0, Lcom/mopub/common/UrlAction$6;

    const-string v1, "OPEN_IN_APP_BROWSER"

    const/4 v7, 0x5

    invoke-direct {v0, v1, v7, v3}, Lcom/mopub/common/UrlAction$6;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Lcom/mopub/common/UrlAction;->OPEN_IN_APP_BROWSER:Lcom/mopub/common/UrlAction;

    .line 169
    new-instance v0, Lcom/mopub/common/UrlAction$7;

    const-string v1, "HANDLE_SHARE_TWEET"

    const/4 v8, 0x6

    invoke-direct {v0, v1, v8, v3}, Lcom/mopub/common/UrlAction$7;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Lcom/mopub/common/UrlAction;->HANDLE_SHARE_TWEET:Lcom/mopub/common/UrlAction;

    .line 198
    new-instance v0, Lcom/mopub/common/UrlAction$8;

    const-string v1, "FOLLOW_DEEP_LINK_WITH_FALLBACK"

    const/4 v9, 0x7

    invoke-direct {v0, v1, v9, v3}, Lcom/mopub/common/UrlAction$8;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Lcom/mopub/common/UrlAction;->FOLLOW_DEEP_LINK_WITH_FALLBACK:Lcom/mopub/common/UrlAction;

    .line 272
    new-instance v0, Lcom/mopub/common/UrlAction$9;

    const-string v1, "FOLLOW_DEEP_LINK"

    const/16 v10, 0x8

    invoke-direct {v0, v1, v10, v3}, Lcom/mopub/common/UrlAction$9;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Lcom/mopub/common/UrlAction;->FOLLOW_DEEP_LINK:Lcom/mopub/common/UrlAction;

    .line 290
    new-instance v0, Lcom/mopub/common/UrlAction$10;

    const-string v1, "NOOP"

    const/16 v11, 0x9

    invoke-direct {v0, v1, v11, v2}, Lcom/mopub/common/UrlAction$10;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Lcom/mopub/common/UrlAction;->NOOP:Lcom/mopub/common/UrlAction;

    const/16 v0, 0xa

    .line 26
    new-array v0, v0, [Lcom/mopub/common/UrlAction;

    sget-object v1, Lcom/mopub/common/UrlAction;->HANDLE_MOPUB_SCHEME:Lcom/mopub/common/UrlAction;

    aput-object v1, v0, v2

    sget-object v1, Lcom/mopub/common/UrlAction;->IGNORE_ABOUT_SCHEME:Lcom/mopub/common/UrlAction;

    aput-object v1, v0, v3

    sget-object v1, Lcom/mopub/common/UrlAction;->HANDLE_PHONE_SCHEME:Lcom/mopub/common/UrlAction;

    aput-object v1, v0, v4

    sget-object v1, Lcom/mopub/common/UrlAction;->OPEN_NATIVE_BROWSER:Lcom/mopub/common/UrlAction;

    aput-object v1, v0, v5

    sget-object v1, Lcom/mopub/common/UrlAction;->OPEN_APP_MARKET:Lcom/mopub/common/UrlAction;

    aput-object v1, v0, v6

    sget-object v1, Lcom/mopub/common/UrlAction;->OPEN_IN_APP_BROWSER:Lcom/mopub/common/UrlAction;

    aput-object v1, v0, v7

    sget-object v1, Lcom/mopub/common/UrlAction;->HANDLE_SHARE_TWEET:Lcom/mopub/common/UrlAction;

    aput-object v1, v0, v8

    sget-object v1, Lcom/mopub/common/UrlAction;->FOLLOW_DEEP_LINK_WITH_FALLBACK:Lcom/mopub/common/UrlAction;

    aput-object v1, v0, v9

    sget-object v1, Lcom/mopub/common/UrlAction;->FOLLOW_DEEP_LINK:Lcom/mopub/common/UrlAction;

    aput-object v1, v0, v10

    sget-object v1, Lcom/mopub/common/UrlAction;->NOOP:Lcom/mopub/common/UrlAction;

    aput-object v1, v0, v11

    sput-object v0, Lcom/mopub/common/UrlAction;->$VALUES:[Lcom/mopub/common/UrlAction;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IZ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)V"
        }
    .end annotation

    .line 322
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 323
    iput-boolean p3, p0, Lcom/mopub/common/UrlAction;->mRequiresUserInteraction:Z

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;IZLcom/mopub/common/UrlAction$1;)V
    .locals 0

    .line 26
    invoke-direct {p0, p1, p2, p3}, Lcom/mopub/common/UrlAction;-><init>(Ljava/lang/String;IZ)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/mopub/common/UrlAction;
    .locals 1

    .line 26
    const-class v0, Lcom/mopub/common/UrlAction;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/mopub/common/UrlAction;

    return-object p0
.end method

.method public static values()[Lcom/mopub/common/UrlAction;
    .locals 1

    .line 26
    sget-object v0, Lcom/mopub/common/UrlAction;->$VALUES:[Lcom/mopub/common/UrlAction;

    invoke-virtual {v0}, [Lcom/mopub/common/UrlAction;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/mopub/common/UrlAction;

    return-object v0
.end method


# virtual methods
.method public handleUrl(Lcom/mopub/common/UrlHandler;Landroid/content/Context;Landroid/net/Uri;ZLjava/lang/String;)V
    .locals 2
    .param p2    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Landroid/net/Uri;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/mopub/exceptions/IntentNotResolvableException;
        }
    .end annotation

    .line 311
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Ad event URL: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/mopub/common/logging/MoPubLog;->d(Ljava/lang/String;)V

    .line 312
    iget-boolean v0, p0, Lcom/mopub/common/UrlAction;->mRequiresUserInteraction:Z

    if-eqz v0, :cond_0

    if-nez p4, :cond_0

    .line 313
    new-instance p1, Lcom/mopub/exceptions/IntentNotResolvableException;

    const-string p2, "Attempted to handle action without user interaction."

    invoke-direct {p1, p2}, Lcom/mopub/exceptions/IntentNotResolvableException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 316
    :cond_0
    invoke-virtual {p0, p2, p3, p1, p5}, Lcom/mopub/common/UrlAction;->performAction(Landroid/content/Context;Landroid/net/Uri;Lcom/mopub/common/UrlHandler;Ljava/lang/String;)V

    return-void
.end method

.method protected abstract performAction(Landroid/content/Context;Landroid/net/Uri;Lcom/mopub/common/UrlHandler;Ljava/lang/String;)V
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/net/Uri;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lcom/mopub/common/UrlHandler;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/mopub/exceptions/IntentNotResolvableException;
        }
    .end annotation
.end method

.method public abstract shouldTryHandlingUrl(Landroid/net/Uri;)Z
    .param p1    # Landroid/net/Uri;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
.end method
