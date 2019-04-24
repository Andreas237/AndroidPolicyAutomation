.class final enum Lcom/huawei/ui/homewear21/home/WearHomeActivity$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/homewear21/home/WearHomeActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4018
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lcom/huawei/ui/homewear21/home/WearHomeActivity$b;>;"
    }
.end annotation


# static fields
.field private static final synthetic a:[Lcom/huawei/ui/homewear21/home/WearHomeActivity$b;

.field public static final enum b:Lcom/huawei/ui/homewear21/home/WearHomeActivity$b;

.field public static final enum c:Lcom/huawei/ui/homewear21/home/WearHomeActivity$b;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 5924
    new-instance v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$b;

    const-string v1, "RATE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/huawei/ui/homewear21/home/WearHomeActivity$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$b;->b:Lcom/huawei/ui/homewear21/home/WearHomeActivity$b;

    new-instance v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$b;

    const-string v1, "NOTIFICATION"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/huawei/ui/homewear21/home/WearHomeActivity$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$b;->c:Lcom/huawei/ui/homewear21/home/WearHomeActivity$b;

    .line 5923
    const/4 v0, 0x2

    new-array v0, v0, [Lcom/huawei/ui/homewear21/home/WearHomeActivity$b;

    sget-object v1, Lcom/huawei/ui/homewear21/home/WearHomeActivity$b;->b:Lcom/huawei/ui/homewear21/home/WearHomeActivity$b;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/ui/homewear21/home/WearHomeActivity$b;->c:Lcom/huawei/ui/homewear21/home/WearHomeActivity$b;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sput-object v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$b;->a:[Lcom/huawei/ui/homewear21/home/WearHomeActivity$b;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 5923
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/huawei/ui/homewear21/home/WearHomeActivity$b;
    .locals 1

    .line 5923
    const-class v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$b;

    return-object v0
.end method

.method public static values()[Lcom/huawei/ui/homewear21/home/WearHomeActivity$b;
    .locals 1

    .line 5923
    sget-object v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$b;->a:[Lcom/huawei/ui/homewear21/home/WearHomeActivity$b;

    invoke-virtual {v0}, [Lcom/huawei/ui/homewear21/home/WearHomeActivity$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/huawei/ui/homewear21/home/WearHomeActivity$b;

    return-object v0
.end method
