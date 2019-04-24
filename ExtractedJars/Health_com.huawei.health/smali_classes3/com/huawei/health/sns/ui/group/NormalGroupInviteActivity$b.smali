.class final enum Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4018
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity$b;>;"
    }
.end annotation


# static fields
.field private static final synthetic a:[Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity$b;

.field public static final enum b:Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity$b;

.field public static final enum e:Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity$b;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 61
    new-instance v0, Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity$b;

    const-string v1, "RECEIVE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity$b;->b:Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity$b;

    .line 62
    new-instance v0, Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity$b;

    const-string v1, "SEND"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity$b;->e:Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity$b;

    .line 59
    const/4 v0, 0x2

    new-array v0, v0, [Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity$b;

    sget-object v1, Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity$b;->b:Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity$b;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity$b;->e:Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity$b;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sput-object v0, Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity$b;->a:[Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity$b;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 59
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity$b;
    .locals 1

    .line 59
    const-class v0, Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity$b;

    return-object v0
.end method

.method public static values()[Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity$b;
    .locals 1

    .line 59
    sget-object v0, Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity$b;->a:[Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity$b;

    invoke-virtual {v0}, [Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/huawei/health/sns/ui/group/NormalGroupInviteActivity$b;

    return-object v0
.end method
