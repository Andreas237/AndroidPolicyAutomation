.class public final enum Lo/fse$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/fse;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lo/fse$a;>;"
    }
.end annotation


# static fields
.field public static final enum a:Lo/fse$a;

.field public static final enum b:Lo/fse$a;

.field public static final enum c:Lo/fse$a;

.field public static final enum e:Lo/fse$a;

.field private static final synthetic f:[Lo/fse$a;


# instance fields
.field private d:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 76
    new-instance v0, Lo/fse$a;

    const-string v1, "ANONYMOUS"

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lo/fse$a;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lo/fse$a;->c:Lo/fse$a;

    new-instance v0, Lo/fse$a;

    const-string v1, "RSA"

    const/4 v2, 0x1

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lo/fse$a;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lo/fse$a;->a:Lo/fse$a;

    new-instance v0, Lo/fse$a;

    const-string v1, "DSA"

    const/4 v2, 0x2

    const/4 v3, 0x2

    invoke-direct {v0, v1, v2, v3}, Lo/fse$a;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lo/fse$a;->e:Lo/fse$a;

    new-instance v0, Lo/fse$a;

    const-string v1, "ECDSA"

    const/4 v2, 0x3

    const/4 v3, 0x3

    invoke-direct {v0, v1, v2, v3}, Lo/fse$a;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lo/fse$a;->b:Lo/fse$a;

    .line 74
    const/4 v0, 0x4

    new-array v0, v0, [Lo/fse$a;

    sget-object v1, Lo/fse$a;->c:Lo/fse$a;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lo/fse$a;->a:Lo/fse$a;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lo/fse$a;->e:Lo/fse$a;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lo/fse$a;->b:Lo/fse$a;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sput-object v0, Lo/fse$a;->f:[Lo/fse$a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    .line 80
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 81
    iput p3, p0, Lo/fse$a;->d:I

    .line 82
    return-void
.end method

.method public static c(I)Lo/fse$a;
    .locals 1

    .line 92
    packed-switch p0, :pswitch_data_0

    goto :goto_0

    .line 94
    :pswitch_0
    sget-object v0, Lo/fse$a;->c:Lo/fse$a;

    return-object v0

    .line 96
    :pswitch_1
    sget-object v0, Lo/fse$a;->a:Lo/fse$a;

    return-object v0

    .line 98
    :pswitch_2
    sget-object v0, Lo/fse$a;->e:Lo/fse$a;

    return-object v0

    .line 100
    :pswitch_3
    sget-object v0, Lo/fse$a;->b:Lo/fse$a;

    return-object v0

    .line 103
    :goto_0
    const/4 v0, 0x0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method public static valueOf(Ljava/lang/String;)Lo/fse$a;
    .locals 1

    .line 74
    const-class v0, Lo/fse$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lo/fse$a;

    return-object v0
.end method

.method public static values()[Lo/fse$a;
    .locals 1

    .line 74
    sget-object v0, Lo/fse$a;->f:[Lo/fse$a;

    invoke-virtual {v0}, [Lo/fse$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo/fse$a;

    return-object v0
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 114
    iget v0, p0, Lo/fse$a;->d:I

    return v0
.end method
