.class final Lcom/huawei/hwid/b$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hwid/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "b"
.end annotation


# instance fields
.field a:Lcom/huawei/hwid/UseCase;


# direct methods
.method constructor <init>(Lcom/huawei/hwid/UseCase;)V
    .locals 0

    .line 71
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 72
    iput-object p1, p0, Lcom/huawei/hwid/b$b;->a:Lcom/huawei/hwid/UseCase;

    .line 73
    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 77
    iget-object v0, p0, Lcom/huawei/hwid/b$b;->a:Lcom/huawei/hwid/UseCase;

    invoke-virtual {v0}, Lcom/huawei/hwid/UseCase;->c()V

    .line 78
    return-void
.end method
