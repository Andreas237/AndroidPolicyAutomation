.class public final enum Lcom/mopub/mraid/ViewState;
.super Ljava/lang/Enum;
.source "ViewState.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/mopub/mraid/ViewState;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/mopub/mraid/ViewState;

.field public static final enum DEFAULT:Lcom/mopub/mraid/ViewState;

.field public static final enum EXPANDED:Lcom/mopub/mraid/ViewState;

.field public static final enum HIDDEN:Lcom/mopub/mraid/ViewState;

.field public static final enum LOADING:Lcom/mopub/mraid/ViewState;

.field public static final enum RESIZED:Lcom/mopub/mraid/ViewState;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 6
    new-instance v0, Lcom/mopub/mraid/ViewState;

    const-string v1, "LOADING"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/mopub/mraid/ViewState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/mopub/mraid/ViewState;->LOADING:Lcom/mopub/mraid/ViewState;

    .line 7
    new-instance v0, Lcom/mopub/mraid/ViewState;

    const-string v1, "DEFAULT"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/mopub/mraid/ViewState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/mopub/mraid/ViewState;->DEFAULT:Lcom/mopub/mraid/ViewState;

    .line 8
    new-instance v0, Lcom/mopub/mraid/ViewState;

    const-string v1, "RESIZED"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lcom/mopub/mraid/ViewState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/mopub/mraid/ViewState;->RESIZED:Lcom/mopub/mraid/ViewState;

    .line 9
    new-instance v0, Lcom/mopub/mraid/ViewState;

    const-string v1, "EXPANDED"

    const/4 v5, 0x3

    invoke-direct {v0, v1, v5}, Lcom/mopub/mraid/ViewState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/mopub/mraid/ViewState;->EXPANDED:Lcom/mopub/mraid/ViewState;

    .line 10
    new-instance v0, Lcom/mopub/mraid/ViewState;

    const-string v1, "HIDDEN"

    const/4 v6, 0x4

    invoke-direct {v0, v1, v6}, Lcom/mopub/mraid/ViewState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/mopub/mraid/ViewState;->HIDDEN:Lcom/mopub/mraid/ViewState;

    const/4 v0, 0x5

    .line 5
    new-array v0, v0, [Lcom/mopub/mraid/ViewState;

    sget-object v1, Lcom/mopub/mraid/ViewState;->LOADING:Lcom/mopub/mraid/ViewState;

    aput-object v1, v0, v2

    sget-object v1, Lcom/mopub/mraid/ViewState;->DEFAULT:Lcom/mopub/mraid/ViewState;

    aput-object v1, v0, v3

    sget-object v1, Lcom/mopub/mraid/ViewState;->RESIZED:Lcom/mopub/mraid/ViewState;

    aput-object v1, v0, v4

    sget-object v1, Lcom/mopub/mraid/ViewState;->EXPANDED:Lcom/mopub/mraid/ViewState;

    aput-object v1, v0, v5

    sget-object v1, Lcom/mopub/mraid/ViewState;->HIDDEN:Lcom/mopub/mraid/ViewState;

    aput-object v1, v0, v6

    sput-object v0, Lcom/mopub/mraid/ViewState;->$VALUES:[Lcom/mopub/mraid/ViewState;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 5
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/mopub/mraid/ViewState;
    .locals 1

    .line 5
    const-class v0, Lcom/mopub/mraid/ViewState;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/mopub/mraid/ViewState;

    return-object p0
.end method

.method public static values()[Lcom/mopub/mraid/ViewState;
    .locals 1

    .line 5
    sget-object v0, Lcom/mopub/mraid/ViewState;->$VALUES:[Lcom/mopub/mraid/ViewState;

    invoke-virtual {v0}, [Lcom/mopub/mraid/ViewState;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/mopub/mraid/ViewState;

    return-object v0
.end method


# virtual methods
.method public toJavascriptString()Ljava/lang/String;
    .locals 2

    .line 13
    invoke-virtual {p0}, Lcom/mopub/mraid/ViewState;->toString()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
