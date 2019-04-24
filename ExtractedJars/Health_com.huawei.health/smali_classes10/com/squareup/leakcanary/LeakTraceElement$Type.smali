.class public final enum Lcom/squareup/leakcanary/LeakTraceElement$Type;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/squareup/leakcanary/LeakTraceElement;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Type"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lcom/squareup/leakcanary/LeakTraceElement$Type;>;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/squareup/leakcanary/LeakTraceElement$Type;

.field public static final enum ARRAY_ENTRY:Lcom/squareup/leakcanary/LeakTraceElement$Type;

.field public static final enum INSTANCE_FIELD:Lcom/squareup/leakcanary/LeakTraceElement$Type;

.field public static final enum LOCAL:Lcom/squareup/leakcanary/LeakTraceElement$Type;

.field public static final enum STATIC_FIELD:Lcom/squareup/leakcanary/LeakTraceElement$Type;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 33
    new-instance v0, Lcom/squareup/leakcanary/LeakTraceElement$Type;

    const-string v1, "INSTANCE_FIELD"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/squareup/leakcanary/LeakTraceElement$Type;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/squareup/leakcanary/LeakTraceElement$Type;->INSTANCE_FIELD:Lcom/squareup/leakcanary/LeakTraceElement$Type;

    new-instance v0, Lcom/squareup/leakcanary/LeakTraceElement$Type;

    const-string v1, "STATIC_FIELD"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/squareup/leakcanary/LeakTraceElement$Type;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/squareup/leakcanary/LeakTraceElement$Type;->STATIC_FIELD:Lcom/squareup/leakcanary/LeakTraceElement$Type;

    new-instance v0, Lcom/squareup/leakcanary/LeakTraceElement$Type;

    const-string v1, "LOCAL"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/squareup/leakcanary/LeakTraceElement$Type;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/squareup/leakcanary/LeakTraceElement$Type;->LOCAL:Lcom/squareup/leakcanary/LeakTraceElement$Type;

    new-instance v0, Lcom/squareup/leakcanary/LeakTraceElement$Type;

    const-string v1, "ARRAY_ENTRY"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/squareup/leakcanary/LeakTraceElement$Type;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/squareup/leakcanary/LeakTraceElement$Type;->ARRAY_ENTRY:Lcom/squareup/leakcanary/LeakTraceElement$Type;

    .line 32
    const/4 v0, 0x4

    new-array v0, v0, [Lcom/squareup/leakcanary/LeakTraceElement$Type;

    sget-object v1, Lcom/squareup/leakcanary/LeakTraceElement$Type;->INSTANCE_FIELD:Lcom/squareup/leakcanary/LeakTraceElement$Type;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lcom/squareup/leakcanary/LeakTraceElement$Type;->STATIC_FIELD:Lcom/squareup/leakcanary/LeakTraceElement$Type;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lcom/squareup/leakcanary/LeakTraceElement$Type;->LOCAL:Lcom/squareup/leakcanary/LeakTraceElement$Type;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lcom/squareup/leakcanary/LeakTraceElement$Type;->ARRAY_ENTRY:Lcom/squareup/leakcanary/LeakTraceElement$Type;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sput-object v0, Lcom/squareup/leakcanary/LeakTraceElement$Type;->$VALUES:[Lcom/squareup/leakcanary/LeakTraceElement$Type;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 32
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/squareup/leakcanary/LeakTraceElement$Type;
    .locals 1

    .line 32
    const-class v0, Lcom/squareup/leakcanary/LeakTraceElement$Type;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/squareup/leakcanary/LeakTraceElement$Type;

    return-object v0
.end method

.method public static values()[Lcom/squareup/leakcanary/LeakTraceElement$Type;
    .locals 1

    .line 32
    sget-object v0, Lcom/squareup/leakcanary/LeakTraceElement$Type;->$VALUES:[Lcom/squareup/leakcanary/LeakTraceElement$Type;

    invoke-virtual {v0}, [Lcom/squareup/leakcanary/LeakTraceElement$Type;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/squareup/leakcanary/LeakTraceElement$Type;

    return-object v0
.end method
