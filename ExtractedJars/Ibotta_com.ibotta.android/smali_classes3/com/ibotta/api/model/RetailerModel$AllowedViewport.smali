.class public final enum Lcom/ibotta/api/model/RetailerModel$AllowedViewport;
.super Ljava/lang/Enum;
.source "RetailerModel.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/api/model/RetailerModel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "AllowedViewport"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ibotta/api/model/RetailerModel$AllowedViewport;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ibotta/api/model/RetailerModel$AllowedViewport;

.field public static final enum DESKTOP:Lcom/ibotta/api/model/RetailerModel$AllowedViewport;

.field public static final enum HANDHELD:Lcom/ibotta/api/model/RetailerModel$AllowedViewport;

.field public static final enum TABLET:Lcom/ibotta/api/model/RetailerModel$AllowedViewport;

.field public static final enum UNKNOWN:Lcom/ibotta/api/model/RetailerModel$AllowedViewport;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 86
    new-instance v0, Lcom/ibotta/api/model/RetailerModel$AllowedViewport;

    const-string v1, "UNKNOWN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/ibotta/api/model/RetailerModel$AllowedViewport;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/api/model/RetailerModel$AllowedViewport;->UNKNOWN:Lcom/ibotta/api/model/RetailerModel$AllowedViewport;

    .line 87
    new-instance v0, Lcom/ibotta/api/model/RetailerModel$AllowedViewport;

    const-string v1, "DESKTOP"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/ibotta/api/model/RetailerModel$AllowedViewport;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/api/model/RetailerModel$AllowedViewport;->DESKTOP:Lcom/ibotta/api/model/RetailerModel$AllowedViewport;

    .line 88
    new-instance v0, Lcom/ibotta/api/model/RetailerModel$AllowedViewport;

    const-string v1, "TABLET"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lcom/ibotta/api/model/RetailerModel$AllowedViewport;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/api/model/RetailerModel$AllowedViewport;->TABLET:Lcom/ibotta/api/model/RetailerModel$AllowedViewport;

    .line 89
    new-instance v0, Lcom/ibotta/api/model/RetailerModel$AllowedViewport;

    const-string v1, "HANDHELD"

    const/4 v5, 0x3

    invoke-direct {v0, v1, v5}, Lcom/ibotta/api/model/RetailerModel$AllowedViewport;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/api/model/RetailerModel$AllowedViewport;->HANDHELD:Lcom/ibotta/api/model/RetailerModel$AllowedViewport;

    const/4 v0, 0x4

    .line 85
    new-array v0, v0, [Lcom/ibotta/api/model/RetailerModel$AllowedViewport;

    sget-object v1, Lcom/ibotta/api/model/RetailerModel$AllowedViewport;->UNKNOWN:Lcom/ibotta/api/model/RetailerModel$AllowedViewport;

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/api/model/RetailerModel$AllowedViewport;->DESKTOP:Lcom/ibotta/api/model/RetailerModel$AllowedViewport;

    aput-object v1, v0, v3

    sget-object v1, Lcom/ibotta/api/model/RetailerModel$AllowedViewport;->TABLET:Lcom/ibotta/api/model/RetailerModel$AllowedViewport;

    aput-object v1, v0, v4

    sget-object v1, Lcom/ibotta/api/model/RetailerModel$AllowedViewport;->HANDHELD:Lcom/ibotta/api/model/RetailerModel$AllowedViewport;

    aput-object v1, v0, v5

    sput-object v0, Lcom/ibotta/api/model/RetailerModel$AllowedViewport;->$VALUES:[Lcom/ibotta/api/model/RetailerModel$AllowedViewport;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 85
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static fromApiName(Ljava/lang/String;)Lcom/ibotta/api/model/RetailerModel$AllowedViewport;
    .locals 1

    if-nez p0, :cond_0

    .line 93
    sget-object p0, Lcom/ibotta/api/model/RetailerModel$AllowedViewport;->UNKNOWN:Lcom/ibotta/api/model/RetailerModel$AllowedViewport;

    return-object p0

    :cond_0
    const/4 v0, 0x0

    .line 98
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/ibotta/api/model/RetailerModel$AllowedViewport;->valueOf(Ljava/lang/String;)Lcom/ibotta/api/model/RetailerModel$AllowedViewport;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    if-nez v0, :cond_1

    .line 104
    sget-object v0, Lcom/ibotta/api/model/RetailerModel$AllowedViewport;->UNKNOWN:Lcom/ibotta/api/model/RetailerModel$AllowedViewport;

    :cond_1
    return-object v0
.end method

.method public static toSet(Ljava/util/Set;)Ljava/util/Set;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/util/Set<",
            "Lcom/ibotta/api/model/RetailerModel$AllowedViewport;",
            ">;"
        }
    .end annotation

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 115
    :cond_0
    new-instance v0, Ljava/util/HashSet;

    invoke-interface {p0}, Ljava/util/Set;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(I)V

    .line 116
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 117
    invoke-static {v1}, Lcom/ibotta/api/model/RetailerModel$AllowedViewport;->fromApiName(Ljava/lang/String;)Lcom/ibotta/api/model/RetailerModel$AllowedViewport;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ibotta/api/model/RetailerModel$AllowedViewport;
    .locals 1

    .line 85
    const-class v0, Lcom/ibotta/api/model/RetailerModel$AllowedViewport;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ibotta/api/model/RetailerModel$AllowedViewport;

    return-object p0
.end method

.method public static values()[Lcom/ibotta/api/model/RetailerModel$AllowedViewport;
    .locals 1

    .line 85
    sget-object v0, Lcom/ibotta/api/model/RetailerModel$AllowedViewport;->$VALUES:[Lcom/ibotta/api/model/RetailerModel$AllowedViewport;

    invoke-virtual {v0}, [Lcom/ibotta/api/model/RetailerModel$AllowedViewport;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ibotta/api/model/RetailerModel$AllowedViewport;

    return-object v0
.end method
