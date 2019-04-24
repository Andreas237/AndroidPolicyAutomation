.class final Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/security/PrivilegedAction;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;->getPrivilegedAction(Ljava/lang/reflect/Field;)Ljava/security/PrivilegedAction;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic val$mField:Ljava/lang/reflect/Field;


# direct methods
.method constructor <init>(Ljava/lang/reflect/Field;)V
    .locals 0

    .line 316
    iput-object p1, p0, Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean$1;->val$mField:Ljava/lang/reflect/Field;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()Ljava/lang/Object;
    .locals 2

    .line 321
    iget-object v0, p0, Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean$1;->val$mField:Ljava/lang/reflect/Field;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 322
    const/4 v0, 0x0

    return-object v0
.end method
