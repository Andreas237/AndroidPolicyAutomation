.class Lcom/huawei/ui/homehealth/HomeFragment$16;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/homehealth/HomeFragment;->o()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/ui/homehealth/HomeFragment;


# direct methods
.method constructor <init>(Lcom/huawei/ui/homehealth/HomeFragment;)V
    .locals 0

    .line 731
    iput-object p1, p0, Lcom/huawei/ui/homehealth/HomeFragment$16;->c:Lcom/huawei/ui/homehealth/HomeFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 734
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment$16;->c:Lcom/huawei/ui/homehealth/HomeFragment;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/HomeFragment;->m(Lcom/huawei/ui/homehealth/HomeFragment;)Lo/esh;

    move-result-object v0

    invoke-virtual {v0}, Lo/esh;->d()V

    .line 735
    return-void
.end method
