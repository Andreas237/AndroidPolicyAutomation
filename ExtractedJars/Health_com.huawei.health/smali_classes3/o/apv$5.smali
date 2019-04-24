.class final Lo/apv$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/apv;->c(Landroid/app/Activity;)Ljava/lang/Runnable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/app/Activity;


# direct methods
.method constructor <init>(Landroid/app/Activity;)V
    .locals 0

    .line 319
    iput-object p1, p0, Lo/apv$5;->a:Landroid/app/Activity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 324
    iget-object v0, p0, Lo/apv$5;->a:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_content_type_unknow_text:I

    invoke-static {v0, v1}, Lo/brh;->c(Landroid/app/Activity;I)V

    .line 325
    return-void
.end method
