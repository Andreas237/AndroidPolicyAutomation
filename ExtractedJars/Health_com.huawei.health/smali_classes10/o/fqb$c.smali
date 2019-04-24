.class public final enum Lo/fqb$c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/fqb;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lo/fqb$c;>;"
    }
.end annotation


# static fields
.field public static final enum b:Lo/fqb$c;

.field public static final enum c:Lo/fqb$c;

.field private static final synthetic e:[Lo/fqb$c;


# instance fields
.field private d:B


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 75
    new-instance v0, Lo/fqb$c;

    const-string v1, "WARNING"

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lo/fqb$c;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lo/fqb$c;->b:Lo/fqb$c;

    new-instance v0, Lo/fqb$c;

    const-string v1, "FATAL"

    const/4 v2, 0x1

    const/4 v3, 0x2

    invoke-direct {v0, v1, v2, v3}, Lo/fqb$c;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lo/fqb$c;->c:Lo/fqb$c;

    .line 74
    const/4 v0, 0x2

    new-array v0, v0, [Lo/fqb$c;

    sget-object v1, Lo/fqb$c;->b:Lo/fqb$c;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lo/fqb$c;->c:Lo/fqb$c;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sput-object v0, Lo/fqb$c;->e:[Lo/fqb$c;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    .line 79
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 80
    int-to-byte v0, p3

    iput-byte v0, p0, Lo/fqb$c;->d:B

    .line 81
    return-void
.end method

.method public static c(I)Lo/fqb$c;
    .locals 1

    .line 94
    sparse-switch p0, :sswitch_data_0

    goto :goto_0

    .line 96
    :sswitch_0
    sget-object v0, Lo/fqb$c;->b:Lo/fqb$c;

    return-object v0

    .line 99
    :sswitch_1
    sget-object v0, Lo/fqb$c;->c:Lo/fqb$c;

    return-object v0

    .line 102
    :goto_0
    const/4 v0, 0x0

    return-object v0

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0x2 -> :sswitch_1
    .end sparse-switch
.end method

.method public static valueOf(Ljava/lang/String;)Lo/fqb$c;
    .locals 1

    .line 74
    const-class v0, Lo/fqb$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lo/fqb$c;

    return-object v0
.end method

.method public static values()[Lo/fqb$c;
    .locals 1

    .line 74
    sget-object v0, Lo/fqb$c;->e:[Lo/fqb$c;

    invoke-virtual {v0}, [Lo/fqb$c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo/fqb$c;

    return-object v0
.end method


# virtual methods
.method public d()B
    .locals 1

    .line 84
    iget-byte v0, p0, Lo/fqb$c;->d:B

    return v0
.end method
