.class public final enum Lo/fsg$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/fsg;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lo/fsg$a;>;"
    }
.end annotation


# static fields
.field public static final enum a:Lo/fsg$a;

.field public static final enum c:Lo/fsg$a;

.field public static final enum d:Lo/fsg$a;

.field private static final synthetic e:[Lo/fsg$a;


# instance fields
.field private b:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 119
    new-instance v0, Lo/fsg$a;

    const-string v1, "UNCOMPRESSED"

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lo/fsg$a;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lo/fsg$a;->a:Lo/fsg$a;

    new-instance v0, Lo/fsg$a;

    const-string v1, "ANSIX962_COMPRESSED_PRIME"

    const/4 v2, 0x1

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lo/fsg$a;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lo/fsg$a;->d:Lo/fsg$a;

    new-instance v0, Lo/fsg$a;

    const-string v1, "ANSIX962_COMPRESSED_CHAR2"

    const/4 v2, 0x2

    const/4 v3, 0x2

    invoke-direct {v0, v1, v2, v3}, Lo/fsg$a;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lo/fsg$a;->c:Lo/fsg$a;

    .line 118
    const/4 v0, 0x3

    new-array v0, v0, [Lo/fsg$a;

    sget-object v1, Lo/fsg$a;->a:Lo/fsg$a;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lo/fsg$a;->d:Lo/fsg$a;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lo/fsg$a;->c:Lo/fsg$a;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sput-object v0, Lo/fsg$a;->e:[Lo/fsg$a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    .line 123
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 124
    iput p3, p0, Lo/fsg$a;->b:I

    .line 125
    return-void
.end method

.method public static b(I)Lo/fsg$a;
    .locals 1

    .line 146
    packed-switch p0, :pswitch_data_0

    goto :goto_0

    .line 148
    :pswitch_0
    sget-object v0, Lo/fsg$a;->a:Lo/fsg$a;

    return-object v0

    .line 150
    :pswitch_1
    sget-object v0, Lo/fsg$a;->d:Lo/fsg$a;

    return-object v0

    .line 152
    :pswitch_2
    sget-object v0, Lo/fsg$a;->c:Lo/fsg$a;

    return-object v0

    .line 155
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

.method public static valueOf(Ljava/lang/String;)Lo/fsg$a;
    .locals 1

    .line 118
    const-class v0, Lo/fsg$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lo/fsg$a;

    return-object v0
.end method

.method public static values()[Lo/fsg$a;
    .locals 1

    .line 118
    sget-object v0, Lo/fsg$a;->e:[Lo/fsg$a;

    invoke-virtual {v0}, [Lo/fsg$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo/fsg$a;

    return-object v0
.end method


# virtual methods
.method public d()I
    .locals 1

    .line 128
    iget v0, p0, Lo/fsg$a;->b:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 133
    iget v0, p0, Lo/fsg$a;->b:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 135
    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "uncompressed ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/fsg$a;->b:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 137
    :pswitch_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ansiX962_compressed_prime ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/fsg$a;->b:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 139
    :pswitch_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ansiX962_compressed_char2 ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/fsg$a;->b:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 141
    :goto_0
    const-string v0, ""

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method
