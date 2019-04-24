.class public final enum Lcom/google/dexmaker/dx/rop/annotation/AnnotationVisibility;
.super Ljava/lang/Enum;
.source "AnnotationVisibility.java"

# interfaces
.implements Lcom/google/dexmaker/dx/util/ToHuman;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/google/dexmaker/dx/rop/annotation/AnnotationVisibility;",
        ">;",
        "Lcom/google/dexmaker/dx/util/ToHuman;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/google/dexmaker/dx/rop/annotation/AnnotationVisibility;

.field public static final enum BUILD:Lcom/google/dexmaker/dx/rop/annotation/AnnotationVisibility;

.field public static final enum EMBEDDED:Lcom/google/dexmaker/dx/rop/annotation/AnnotationVisibility;

.field public static final enum RUNTIME:Lcom/google/dexmaker/dx/rop/annotation/AnnotationVisibility;

.field public static final enum SYSTEM:Lcom/google/dexmaker/dx/rop/annotation/AnnotationVisibility;


# instance fields
.field private final human:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 25
    new-instance v0, Lcom/google/dexmaker/dx/rop/annotation/AnnotationVisibility;

    const-string v1, "RUNTIME"

    const-string v2, "runtime"

    const/4 v3, 0x0

    invoke-direct {v0, v1, v3, v2}, Lcom/google/dexmaker/dx/rop/annotation/AnnotationVisibility;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/google/dexmaker/dx/rop/annotation/AnnotationVisibility;->RUNTIME:Lcom/google/dexmaker/dx/rop/annotation/AnnotationVisibility;

    .line 26
    new-instance v0, Lcom/google/dexmaker/dx/rop/annotation/AnnotationVisibility;

    const-string v1, "BUILD"

    const-string v2, "build"

    const/4 v4, 0x1

    invoke-direct {v0, v1, v4, v2}, Lcom/google/dexmaker/dx/rop/annotation/AnnotationVisibility;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/google/dexmaker/dx/rop/annotation/AnnotationVisibility;->BUILD:Lcom/google/dexmaker/dx/rop/annotation/AnnotationVisibility;

    .line 27
    new-instance v0, Lcom/google/dexmaker/dx/rop/annotation/AnnotationVisibility;

    const-string v1, "SYSTEM"

    const-string/jumbo v2, "system"

    const/4 v5, 0x2

    invoke-direct {v0, v1, v5, v2}, Lcom/google/dexmaker/dx/rop/annotation/AnnotationVisibility;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/google/dexmaker/dx/rop/annotation/AnnotationVisibility;->SYSTEM:Lcom/google/dexmaker/dx/rop/annotation/AnnotationVisibility;

    .line 28
    new-instance v0, Lcom/google/dexmaker/dx/rop/annotation/AnnotationVisibility;

    const-string v1, "EMBEDDED"

    const-string v2, "embedded"

    const/4 v6, 0x3

    invoke-direct {v0, v1, v6, v2}, Lcom/google/dexmaker/dx/rop/annotation/AnnotationVisibility;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/google/dexmaker/dx/rop/annotation/AnnotationVisibility;->EMBEDDED:Lcom/google/dexmaker/dx/rop/annotation/AnnotationVisibility;

    const/4 v0, 0x4

    .line 24
    new-array v0, v0, [Lcom/google/dexmaker/dx/rop/annotation/AnnotationVisibility;

    sget-object v1, Lcom/google/dexmaker/dx/rop/annotation/AnnotationVisibility;->RUNTIME:Lcom/google/dexmaker/dx/rop/annotation/AnnotationVisibility;

    aput-object v1, v0, v3

    sget-object v1, Lcom/google/dexmaker/dx/rop/annotation/AnnotationVisibility;->BUILD:Lcom/google/dexmaker/dx/rop/annotation/AnnotationVisibility;

    aput-object v1, v0, v4

    sget-object v1, Lcom/google/dexmaker/dx/rop/annotation/AnnotationVisibility;->SYSTEM:Lcom/google/dexmaker/dx/rop/annotation/AnnotationVisibility;

    aput-object v1, v0, v5

    sget-object v1, Lcom/google/dexmaker/dx/rop/annotation/AnnotationVisibility;->EMBEDDED:Lcom/google/dexmaker/dx/rop/annotation/AnnotationVisibility;

    aput-object v1, v0, v6

    sput-object v0, Lcom/google/dexmaker/dx/rop/annotation/AnnotationVisibility;->$VALUES:[Lcom/google/dexmaker/dx/rop/annotation/AnnotationVisibility;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 38
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 39
    iput-object p3, p0, Lcom/google/dexmaker/dx/rop/annotation/AnnotationVisibility;->human:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/google/dexmaker/dx/rop/annotation/AnnotationVisibility;
    .locals 1

    .line 24
    const-class v0, Lcom/google/dexmaker/dx/rop/annotation/AnnotationVisibility;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/google/dexmaker/dx/rop/annotation/AnnotationVisibility;

    return-object p0
.end method

.method public static values()[Lcom/google/dexmaker/dx/rop/annotation/AnnotationVisibility;
    .locals 1

    .line 24
    sget-object v0, Lcom/google/dexmaker/dx/rop/annotation/AnnotationVisibility;->$VALUES:[Lcom/google/dexmaker/dx/rop/annotation/AnnotationVisibility;

    invoke-virtual {v0}, [Lcom/google/dexmaker/dx/rop/annotation/AnnotationVisibility;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/dexmaker/dx/rop/annotation/AnnotationVisibility;

    return-object v0
.end method


# virtual methods
.method public toHuman()Ljava/lang/String;
    .locals 1

    .line 44
    iget-object v0, p0, Lcom/google/dexmaker/dx/rop/annotation/AnnotationVisibility;->human:Ljava/lang/String;

    return-object v0
.end method
