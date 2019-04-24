.class public final enum Lcom/squareup/leakcanary/LeakTraceElement$Holder;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/squareup/leakcanary/LeakTraceElement;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Holder"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lcom/squareup/leakcanary/LeakTraceElement$Holder;>;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/squareup/leakcanary/LeakTraceElement$Holder;

.field public static final enum ARRAY:Lcom/squareup/leakcanary/LeakTraceElement$Holder;

.field public static final enum CLASS:Lcom/squareup/leakcanary/LeakTraceElement$Holder;

.field public static final enum OBJECT:Lcom/squareup/leakcanary/LeakTraceElement$Holder;

.field public static final enum THREAD:Lcom/squareup/leakcanary/LeakTraceElement$Holder;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 37
    new-instance v0, Lcom/squareup/leakcanary/LeakTraceElement$Holder;

    const-string v1, "OBJECT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/squareup/leakcanary/LeakTraceElement$Holder;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/squareup/leakcanary/LeakTraceElement$Holder;->OBJECT:Lcom/squareup/leakcanary/LeakTraceElement$Holder;

    new-instance v0, Lcom/squareup/leakcanary/LeakTraceElement$Holder;

    const-string v1, "CLASS"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/squareup/leakcanary/LeakTraceElement$Holder;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/squareup/leakcanary/LeakTraceElement$Holder;->CLASS:Lcom/squareup/leakcanary/LeakTraceElement$Holder;

    new-instance v0, Lcom/squareup/leakcanary/LeakTraceElement$Holder;

    const-string v1, "THREAD"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/squareup/leakcanary/LeakTraceElement$Holder;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/squareup/leakcanary/LeakTraceElement$Holder;->THREAD:Lcom/squareup/leakcanary/LeakTraceElement$Holder;

    new-instance v0, Lcom/squareup/leakcanary/LeakTraceElement$Holder;

    const-string v1, "ARRAY"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/squareup/leakcanary/LeakTraceElement$Holder;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/squareup/leakcanary/LeakTraceElement$Holder;->ARRAY:Lcom/squareup/leakcanary/LeakTraceElement$Holder;

    .line 36
    const/4 v0, 0x4

    new-array v0, v0, [Lcom/squareup/leakcanary/LeakTraceElement$Holder;

    sget-object v1, Lcom/squareup/leakcanary/LeakTraceElement$Holder;->OBJECT:Lcom/squareup/leakcanary/LeakTraceElement$Holder;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lcom/squareup/leakcanary/LeakTraceElement$Holder;->CLASS:Lcom/squareup/leakcanary/LeakTraceElement$Holder;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lcom/squareup/leakcanary/LeakTraceElement$Holder;->THREAD:Lcom/squareup/leakcanary/LeakTraceElement$Holder;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lcom/squareup/leakcanary/LeakTraceElement$Holder;->ARRAY:Lcom/squareup/leakcanary/LeakTraceElement$Holder;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sput-object v0, Lcom/squareup/leakcanary/LeakTraceElement$Holder;->$VALUES:[Lcom/squareup/leakcanary/LeakTraceElement$Holder;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 36
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/squareup/leakcanary/LeakTraceElement$Holder;
    .locals 1

    .line 36
    const-class v0, Lcom/squareup/leakcanary/LeakTraceElement$Holder;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/squareup/leakcanary/LeakTraceElement$Holder;

    return-object v0
.end method

.method public static values()[Lcom/squareup/leakcanary/LeakTraceElement$Holder;
    .locals 1

    .line 36
    sget-object v0, Lcom/squareup/leakcanary/LeakTraceElement$Holder;->$VALUES:[Lcom/squareup/leakcanary/LeakTraceElement$Holder;

    invoke-virtual {v0}, [Lcom/squareup/leakcanary/LeakTraceElement$Holder;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/squareup/leakcanary/LeakTraceElement$Holder;

    return-object v0
.end method
