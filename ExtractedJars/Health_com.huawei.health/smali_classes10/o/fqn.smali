.class public final enum Lo/fqn;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lo/fqn;>;"
    }
.end annotation


# static fields
.field public static final enum a:Lo/fqn;

.field public static final enum b:Lo/fqn;

.field public static final enum c:Lo/fqn;

.field public static final enum e:Lo/fqn;

.field private static final synthetic g:[Lo/fqn;


# instance fields
.field private d:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 27
    new-instance v0, Lo/fqn;

    const-string v1, "CHANGE_CIPHER_SPEC"

    const/4 v2, 0x0

    const/16 v3, 0x14

    invoke-direct {v0, v1, v2, v3}, Lo/fqn;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lo/fqn;->b:Lo/fqn;

    new-instance v0, Lo/fqn;

    const-string v1, "ALERT"

    const/4 v2, 0x1

    const/16 v3, 0x15

    invoke-direct {v0, v1, v2, v3}, Lo/fqn;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lo/fqn;->e:Lo/fqn;

    new-instance v0, Lo/fqn;

    const-string v1, "HANDSHAKE"

    const/4 v2, 0x2

    const/16 v3, 0x16

    invoke-direct {v0, v1, v2, v3}, Lo/fqn;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lo/fqn;->a:Lo/fqn;

    new-instance v0, Lo/fqn;

    const-string v1, "APPLICATION_DATA"

    const/4 v2, 0x3

    const/16 v3, 0x17

    invoke-direct {v0, v1, v2, v3}, Lo/fqn;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lo/fqn;->c:Lo/fqn;

    .line 25
    const/4 v0, 0x4

    new-array v0, v0, [Lo/fqn;

    sget-object v1, Lo/fqn;->b:Lo/fqn;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lo/fqn;->e:Lo/fqn;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lo/fqn;->a:Lo/fqn;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lo/fqn;->c:Lo/fqn;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sput-object v0, Lo/fqn;->g:[Lo/fqn;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    .line 35
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 36
    iput p3, p0, Lo/fqn;->d:I

    .line 37
    return-void
.end method

.method public static b(I)Lo/fqn;
    .locals 1

    .line 49
    packed-switch p0, :pswitch_data_0

    goto :goto_0

    .line 51
    :pswitch_0
    sget-object v0, Lo/fqn;->b:Lo/fqn;

    return-object v0

    .line 53
    :pswitch_1
    sget-object v0, Lo/fqn;->e:Lo/fqn;

    return-object v0

    .line 55
    :pswitch_2
    sget-object v0, Lo/fqn;->a:Lo/fqn;

    return-object v0

    .line 57
    :pswitch_3
    sget-object v0, Lo/fqn;->c:Lo/fqn;

    return-object v0

    .line 60
    :goto_0
    const/4 v0, 0x0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x14
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method public static valueOf(Ljava/lang/String;)Lo/fqn;
    .locals 1

    .line 25
    const-class v0, Lo/fqn;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lo/fqn;

    return-object v0
.end method

.method public static values()[Lo/fqn;
    .locals 1

    .line 25
    sget-object v0, Lo/fqn;->g:[Lo/fqn;

    invoke-virtual {v0}, [Lo/fqn;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo/fqn;

    return-object v0
.end method


# virtual methods
.method public c()I
    .locals 1

    .line 32
    iget v0, p0, Lo/fqn;->d:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 66
    iget v0, p0, Lo/fqn;->d:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 68
    :pswitch_0
    const-string v0, "Change Cipher Spec (20)"

    return-object v0

    .line 70
    :pswitch_1
    const-string v0, "Alert (21)"

    return-object v0

    .line 72
    :pswitch_2
    const-string v0, "Handshake (22)"

    return-object v0

    .line 74
    :pswitch_3
    const-string v0, "Application Data (23)"

    return-object v0

    .line 77
    :goto_0
    const-string v0, "Unknown Content Type"

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x14
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method
