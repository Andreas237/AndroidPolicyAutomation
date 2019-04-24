.class final Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/security/PrivilegedAction;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean;->getPrivilegedAction([Ljava/lang/reflect/Field;I)Ljava/security/PrivilegedAction;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic val$fields:[Ljava/lang/reflect/Field;

.field final synthetic val$position:I


# direct methods
.method constructor <init>([Ljava/lang/reflect/Field;I)V
    .locals 0

    .line 94
    iput-object p1, p0, Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean$1;->val$fields:[Ljava/lang/reflect/Field;

    iput p2, p0, Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean$1;->val$position:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()Ljava/lang/Object;
    .locals 2

    .line 99
    iget-object v0, p0, Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean$1;->val$fields:[Ljava/lang/reflect/Field;

    iget v1, p0, Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean$1;->val$position:I

    aget-object v0, v0, v1

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 100
    const/4 v0, 0x0

    return-object v0
.end method
