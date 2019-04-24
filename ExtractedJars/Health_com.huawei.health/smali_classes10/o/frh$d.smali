.class public final enum Lo/frh$d;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/frh;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lo/frh$d;>;"
    }
.end annotation


# static fields
.field public static final enum b:Lo/frh$d;

.field public static final enum c:Lo/frh$d;

.field public static final enum d:Lo/frh$d;

.field public static final enum e:Lo/frh$d;

.field private static final synthetic f:[Lo/frh$d;


# instance fields
.field private a:I

.field private i:I


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 107
    new-instance v0, Lo/frh$d;

    const-string v1, "BYTES_512"

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/16 v4, 0x200

    invoke-direct {v0, v1, v2, v3, v4}, Lo/frh$d;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lo/frh$d;->b:Lo/frh$d;

    new-instance v0, Lo/frh$d;

    const-string v1, "BYTES_1024"

    const/4 v2, 0x1

    const/4 v3, 0x2

    const/16 v4, 0x400

    invoke-direct {v0, v1, v2, v3, v4}, Lo/frh$d;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lo/frh$d;->e:Lo/frh$d;

    new-instance v0, Lo/frh$d;

    const-string v1, "BYTES_2048"

    const/4 v2, 0x2

    const/4 v3, 0x3

    const/16 v4, 0x800

    invoke-direct {v0, v1, v2, v3, v4}, Lo/frh$d;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lo/frh$d;->d:Lo/frh$d;

    new-instance v0, Lo/frh$d;

    const-string v1, "BYTES_4096"

    const/4 v2, 0x3

    const/4 v3, 0x4

    const/16 v4, 0x1000

    invoke-direct {v0, v1, v2, v3, v4}, Lo/frh$d;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lo/frh$d;->c:Lo/frh$d;

    .line 106
    const/4 v0, 0x4

    new-array v0, v0, [Lo/frh$d;

    sget-object v1, Lo/frh$d;->b:Lo/frh$d;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lo/frh$d;->e:Lo/frh$d;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lo/frh$d;->d:Lo/frh$d;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lo/frh$d;->c:Lo/frh$d;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sput-object v0, Lo/frh$d;->f:[Lo/frh$d;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;III)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)V"
        }
    .end annotation

    .line 112
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 113
    iput p3, p0, Lo/frh$d;->a:I

    .line 114
    iput p4, p0, Lo/frh$d;->i:I

    .line 115
    return-void
.end method

.method static synthetic a(Lo/frh$d;)I
    .locals 1

    .line 106
    iget v0, p0, Lo/frh$d;->a:I

    return v0
.end method

.method public static a(I)Lo/frh$d;
    .locals 1

    .line 137
    packed-switch p0, :pswitch_data_0

    goto :goto_0

    .line 139
    :pswitch_0
    sget-object v0, Lo/frh$d;->b:Lo/frh$d;

    return-object v0

    .line 141
    :pswitch_1
    sget-object v0, Lo/frh$d;->e:Lo/frh$d;

    return-object v0

    .line 143
    :pswitch_2
    sget-object v0, Lo/frh$d;->d:Lo/frh$d;

    return-object v0

    .line 145
    :pswitch_3
    sget-object v0, Lo/frh$d;->c:Lo/frh$d;

    return-object v0

    .line 147
    :goto_0
    const/4 v0, 0x0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method public static valueOf(Ljava/lang/String;)Lo/frh$d;
    .locals 1

    .line 106
    const-class v0, Lo/frh$d;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lo/frh$d;

    return-object v0
.end method

.method public static values()[Lo/frh$d;
    .locals 1

    .line 106
    sget-object v0, Lo/frh$d;->f:[Lo/frh$d;

    invoke-virtual {v0}, [Lo/frh$d;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo/frh$d;

    return-object v0
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 118
    iget v0, p0, Lo/frh$d;->a:I

    return v0
.end method

.method public e()I
    .locals 1

    .line 127
    iget v0, p0, Lo/frh$d;->i:I

    return v0
.end method
