.class Lcom/huawei/health/SelectCountryListActivity$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/SelectCountryListActivity;->b()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/health/SelectCountryListActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/SelectCountryListActivity;)V
    .locals 0

    .line 35
    iput-object p1, p0, Lcom/huawei/health/SelectCountryListActivity$4;->e:Lcom/huawei/health/SelectCountryListActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 38
    iget-object v0, p0, Lcom/huawei/health/SelectCountryListActivity$4;->e:Lcom/huawei/health/SelectCountryListActivity;

    invoke-virtual {v0}, Lcom/huawei/health/SelectCountryListActivity;->finish()V

    .line 39
    return-void
.end method
