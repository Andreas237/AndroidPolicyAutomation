.class public final enum Lo/fqf$e;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/fqf;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lo/fqf$e;>;"
    }
.end annotation


# static fields
.field private static final synthetic a:[Lo/fqf$e;

.field public static final enum b:Lo/fqf$e;

.field public static final enum c:Lo/fqf$e;

.field public static final enum e:Lo/fqf$e;


# instance fields
.field private d:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 151
    new-instance v0, Lo/fqf$e;

    const-string v1, "X_509"

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lo/fqf$e;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lo/fqf$e;->c:Lo/fqf$e;

    new-instance v0, Lo/fqf$e;

    const-string v1, "OPEN_PGP"

    const/4 v2, 0x1

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lo/fqf$e;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lo/fqf$e;->b:Lo/fqf$e;

    new-instance v0, Lo/fqf$e;

    const-string v1, "RAW_PUBLIC_KEY"

    const/4 v2, 0x2

    const/4 v3, 0x2

    invoke-direct {v0, v1, v2, v3}, Lo/fqf$e;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lo/fqf$e;->e:Lo/fqf$e;

    .line 149
    const/4 v0, 0x3

    new-array v0, v0, [Lo/fqf$e;

    sget-object v1, Lo/fqf$e;->c:Lo/fqf$e;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lo/fqf$e;->b:Lo/fqf$e;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lo/fqf$e;->e:Lo/fqf$e;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sput-object v0, Lo/fqf$e;->a:[Lo/fqf$e;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    .line 155
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 156
    iput p3, p0, Lo/fqf$e;->d:I

    .line 157
    return-void
.end method

.method public static c(I)Lo/fqf$e;
    .locals 1

    .line 160
    packed-switch p0, :pswitch_data_0

    goto :goto_0

    .line 162
    :pswitch_0
    sget-object v0, Lo/fqf$e;->c:Lo/fqf$e;

    return-object v0

    .line 164
    :pswitch_1
    sget-object v0, Lo/fqf$e;->b:Lo/fqf$e;

    return-object v0

    .line 166
    :pswitch_2
    sget-object v0, Lo/fqf$e;->e:Lo/fqf$e;

    return-object v0

    .line 169
    :goto_0
    const/4 v0, 0x0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public static valueOf(Ljava/lang/String;)Lo/fqf$e;
    .locals 1

    .line 149
    const-class v0, Lo/fqf$e;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lo/fqf$e;

    return-object v0
.end method

.method public static values()[Lo/fqf$e;
    .locals 1

    .line 149
    sget-object v0, Lo/fqf$e;->a:[Lo/fqf$e;

    invoke-virtual {v0}, [Lo/fqf$e;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo/fqf$e;

    return-object v0
.end method


# virtual methods
.method d()I
    .locals 1

    .line 174
    iget v0, p0, Lo/fqf$e;->d:I

    return v0
.end method
