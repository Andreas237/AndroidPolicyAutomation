.class public final enum Lcom/google/dexmaker/dx/dex/code/LocalList$Disposition;
.super Ljava/lang/Enum;
.source "LocalList.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/dexmaker/dx/dex/code/LocalList;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Disposition"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/google/dexmaker/dx/dex/code/LocalList$Disposition;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/google/dexmaker/dx/dex/code/LocalList$Disposition;

.field public static final enum END_CLOBBERED_BY_NEXT:Lcom/google/dexmaker/dx/dex/code/LocalList$Disposition;

.field public static final enum END_CLOBBERED_BY_PREV:Lcom/google/dexmaker/dx/dex/code/LocalList$Disposition;

.field public static final enum END_MOVED:Lcom/google/dexmaker/dx/dex/code/LocalList$Disposition;

.field public static final enum END_REPLACED:Lcom/google/dexmaker/dx/dex/code/LocalList$Disposition;

.field public static final enum END_SIMPLY:Lcom/google/dexmaker/dx/dex/code/LocalList$Disposition;

.field public static final enum START:Lcom/google/dexmaker/dx/dex/code/LocalList$Disposition;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 93
    new-instance v0, Lcom/google/dexmaker/dx/dex/code/LocalList$Disposition;

    const-string v1, "START"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/google/dexmaker/dx/dex/code/LocalList$Disposition;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/dexmaker/dx/dex/code/LocalList$Disposition;->START:Lcom/google/dexmaker/dx/dex/code/LocalList$Disposition;

    .line 96
    new-instance v0, Lcom/google/dexmaker/dx/dex/code/LocalList$Disposition;

    const-string v1, "END_SIMPLY"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/google/dexmaker/dx/dex/code/LocalList$Disposition;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/dexmaker/dx/dex/code/LocalList$Disposition;->END_SIMPLY:Lcom/google/dexmaker/dx/dex/code/LocalList$Disposition;

    .line 99
    new-instance v0, Lcom/google/dexmaker/dx/dex/code/LocalList$Disposition;

    const-string v1, "END_REPLACED"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lcom/google/dexmaker/dx/dex/code/LocalList$Disposition;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/dexmaker/dx/dex/code/LocalList$Disposition;->END_REPLACED:Lcom/google/dexmaker/dx/dex/code/LocalList$Disposition;

    .line 102
    new-instance v0, Lcom/google/dexmaker/dx/dex/code/LocalList$Disposition;

    const-string v1, "END_MOVED"

    const/4 v5, 0x3

    invoke-direct {v0, v1, v5}, Lcom/google/dexmaker/dx/dex/code/LocalList$Disposition;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/dexmaker/dx/dex/code/LocalList$Disposition;->END_MOVED:Lcom/google/dexmaker/dx/dex/code/LocalList$Disposition;

    .line 108
    new-instance v0, Lcom/google/dexmaker/dx/dex/code/LocalList$Disposition;

    const-string v1, "END_CLOBBERED_BY_PREV"

    const/4 v6, 0x4

    invoke-direct {v0, v1, v6}, Lcom/google/dexmaker/dx/dex/code/LocalList$Disposition;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/dexmaker/dx/dex/code/LocalList$Disposition;->END_CLOBBERED_BY_PREV:Lcom/google/dexmaker/dx/dex/code/LocalList$Disposition;

    .line 114
    new-instance v0, Lcom/google/dexmaker/dx/dex/code/LocalList$Disposition;

    const-string v1, "END_CLOBBERED_BY_NEXT"

    const/4 v7, 0x5

    invoke-direct {v0, v1, v7}, Lcom/google/dexmaker/dx/dex/code/LocalList$Disposition;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/dexmaker/dx/dex/code/LocalList$Disposition;->END_CLOBBERED_BY_NEXT:Lcom/google/dexmaker/dx/dex/code/LocalList$Disposition;

    const/4 v0, 0x6

    .line 91
    new-array v0, v0, [Lcom/google/dexmaker/dx/dex/code/LocalList$Disposition;

    sget-object v1, Lcom/google/dexmaker/dx/dex/code/LocalList$Disposition;->START:Lcom/google/dexmaker/dx/dex/code/LocalList$Disposition;

    aput-object v1, v0, v2

    sget-object v1, Lcom/google/dexmaker/dx/dex/code/LocalList$Disposition;->END_SIMPLY:Lcom/google/dexmaker/dx/dex/code/LocalList$Disposition;

    aput-object v1, v0, v3

    sget-object v1, Lcom/google/dexmaker/dx/dex/code/LocalList$Disposition;->END_REPLACED:Lcom/google/dexmaker/dx/dex/code/LocalList$Disposition;

    aput-object v1, v0, v4

    sget-object v1, Lcom/google/dexmaker/dx/dex/code/LocalList$Disposition;->END_MOVED:Lcom/google/dexmaker/dx/dex/code/LocalList$Disposition;

    aput-object v1, v0, v5

    sget-object v1, Lcom/google/dexmaker/dx/dex/code/LocalList$Disposition;->END_CLOBBERED_BY_PREV:Lcom/google/dexmaker/dx/dex/code/LocalList$Disposition;

    aput-object v1, v0, v6

    sget-object v1, Lcom/google/dexmaker/dx/dex/code/LocalList$Disposition;->END_CLOBBERED_BY_NEXT:Lcom/google/dexmaker/dx/dex/code/LocalList$Disposition;

    aput-object v1, v0, v7

    sput-object v0, Lcom/google/dexmaker/dx/dex/code/LocalList$Disposition;->$VALUES:[Lcom/google/dexmaker/dx/dex/code/LocalList$Disposition;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 91
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/google/dexmaker/dx/dex/code/LocalList$Disposition;
    .locals 1

    .line 91
    const-class v0, Lcom/google/dexmaker/dx/dex/code/LocalList$Disposition;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/google/dexmaker/dx/dex/code/LocalList$Disposition;

    return-object p0
.end method

.method public static values()[Lcom/google/dexmaker/dx/dex/code/LocalList$Disposition;
    .locals 1

    .line 91
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/LocalList$Disposition;->$VALUES:[Lcom/google/dexmaker/dx/dex/code/LocalList$Disposition;

    invoke-virtual {v0}, [Lcom/google/dexmaker/dx/dex/code/LocalList$Disposition;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/dexmaker/dx/dex/code/LocalList$Disposition;

    return-object v0
.end method
