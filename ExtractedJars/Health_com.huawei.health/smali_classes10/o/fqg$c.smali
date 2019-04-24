.class public final enum Lo/fqg$c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/fqg;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lo/fqg$c;>;"
    }
.end annotation


# static fields
.field public static final enum c:Lo/fqg$c;

.field private static final synthetic e:[Lo/fqg$c;


# instance fields
.field private a:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 61
    new-instance v0, Lo/fqg$c;

    const-string v1, "CHANGE_CIPHER_SPEC"

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lo/fqg$c;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lo/fqg$c;->c:Lo/fqg$c;

    .line 60
    const/4 v0, 0x1

    new-array v0, v0, [Lo/fqg$c;

    sget-object v1, Lo/fqg$c;->c:Lo/fqg$c;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sput-object v0, Lo/fqg$c;->e:[Lo/fqg$c;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    .line 65
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 66
    iput p3, p0, Lo/fqg$c;->a:I

    .line 67
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lo/fqg$c;
    .locals 1

    .line 60
    const-class v0, Lo/fqg$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lo/fqg$c;

    return-object v0
.end method

.method public static values()[Lo/fqg$c;
    .locals 1

    .line 60
    sget-object v0, Lo/fqg$c;->e:[Lo/fqg$c;

    invoke-virtual {v0}, [Lo/fqg$c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo/fqg$c;

    return-object v0
.end method


# virtual methods
.method public b()I
    .locals 1

    .line 70
    iget v0, p0, Lo/fqg$c;->a:I

    return v0
.end method
