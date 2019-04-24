.class public final enum Lo/acl$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/acl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lo/acl$a;>;"
    }
.end annotation


# static fields
.field public static final enum a:Lo/acl$a;

.field public static final enum b:Lo/acl$a;

.field public static final enum c:Lo/acl$a;

.field public static final enum d:Lo/acl$a;

.field public static final enum e:Lo/acl$a;

.field public static final enum f:Lo/acl$a;

.field public static final enum g:Lo/acl$a;

.field private static final synthetic h:[Lo/acl$a;

.field public static final enum i:Lo/acl$a;

.field public static final enum k:Lo/acl$a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 9
    new-instance v0, Lo/acl$a;

    const-string v1, "HDK_UNKNOWN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lo/acl$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/acl$a;->b:Lo/acl$a;

    .line 10
    new-instance v0, Lo/acl$a;

    const-string v1, "HDK_WEIGHT"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lo/acl$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/acl$a;->c:Lo/acl$a;

    .line 11
    new-instance v0, Lo/acl$a;

    const-string v1, "HDK_HEIGHT"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lo/acl$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/acl$a;->e:Lo/acl$a;

    .line 12
    new-instance v0, Lo/acl$a;

    const-string v1, "HDK_BLOOD_PRESSURE"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lo/acl$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/acl$a;->a:Lo/acl$a;

    .line 13
    new-instance v0, Lo/acl$a;

    const-string v1, "HDK_BLOOD_SUGAR"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lo/acl$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/acl$a;->d:Lo/acl$a;

    .line 14
    new-instance v0, Lo/acl$a;

    const-string v1, "HDK_HEART_RATE"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lo/acl$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/acl$a;->g:Lo/acl$a;

    .line 15
    new-instance v0, Lo/acl$a;

    const-string v1, "HDK_ECG"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lo/acl$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/acl$a;->k:Lo/acl$a;

    .line 16
    new-instance v0, Lo/acl$a;

    const-string v1, "HDK_STEPS"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Lo/acl$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/acl$a;->f:Lo/acl$a;

    .line 17
    new-instance v0, Lo/acl$a;

    const-string v1, "HDK_WEAR"

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2}, Lo/acl$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/acl$a;->i:Lo/acl$a;

    .line 8
    const/16 v0, 0x9

    new-array v0, v0, [Lo/acl$a;

    sget-object v1, Lo/acl$a;->b:Lo/acl$a;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lo/acl$a;->c:Lo/acl$a;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lo/acl$a;->e:Lo/acl$a;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lo/acl$a;->a:Lo/acl$a;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lo/acl$a;->d:Lo/acl$a;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, Lo/acl$a;->g:Lo/acl$a;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    sget-object v1, Lo/acl$a;->k:Lo/acl$a;

    const/4 v2, 0x6

    aput-object v1, v0, v2

    sget-object v1, Lo/acl$a;->f:Lo/acl$a;

    const/4 v2, 0x7

    aput-object v1, v0, v2

    sget-object v1, Lo/acl$a;->i:Lo/acl$a;

    const/16 v2, 0x8

    aput-object v1, v0, v2

    sput-object v0, Lo/acl$a;->h:[Lo/acl$a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 8
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lo/acl$a;
    .locals 1

    .line 8
    const-class v0, Lo/acl$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lo/acl$a;

    return-object v0
.end method

.method public static values()[Lo/acl$a;
    .locals 1

    .line 8
    sget-object v0, Lo/acl$a;->h:[Lo/acl$a;

    invoke-virtual {v0}, [Lo/acl$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo/acl$a;

    return-object v0
.end method
