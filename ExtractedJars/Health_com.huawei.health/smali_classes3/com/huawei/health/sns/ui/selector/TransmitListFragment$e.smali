.class public final enum Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/ui/selector/TransmitListFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;>;"
    }
.end annotation


# static fields
.field public static final enum a:Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;

.field public static final enum b:Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;

.field public static final enum c:Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;

.field public static final enum d:Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;

.field public static final enum e:Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;

.field private static final synthetic h:[Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 181
    new-instance v0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;

    const-string v1, "TransmitMsg"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;->c:Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;

    .line 182
    new-instance v0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;

    const-string v1, "VCardMsg"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;->b:Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;

    .line 183
    new-instance v0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;

    const-string v1, "ShareMsg"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;->d:Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;

    .line 184
    new-instance v0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;

    const-string v1, "ShareLinkMsg"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;->a:Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;

    .line 185
    new-instance v0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;

    const-string v1, "SendPhotoMsg"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;->e:Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;

    .line 179
    const/4 v0, 0x5

    new-array v0, v0, [Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;

    sget-object v1, Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;->c:Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;->b:Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;->d:Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;->a:Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;->e:Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sput-object v0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;->h:[Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 179
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;
    .locals 1

    .line 179
    const-class v0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;

    return-object v0
.end method

.method public static values()[Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;
    .locals 1

    .line 179
    sget-object v0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;->h:[Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;

    invoke-virtual {v0}, [Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;

    return-object v0
.end method
