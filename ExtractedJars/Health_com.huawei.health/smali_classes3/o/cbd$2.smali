.class Lo/cbd$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cbd;->a(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/Object;

.field final synthetic c:[Ljava/lang/Object;

.field final synthetic d:Lo/cbd;

.field final synthetic e:Ljava/lang/reflect/Method;


# direct methods
.method constructor <init>(Lo/cbd;Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)V
    .locals 0

    .line 49
    iput-object p1, p0, Lo/cbd$2;->d:Lo/cbd;

    iput-object p2, p0, Lo/cbd$2;->a:Ljava/lang/Object;

    iput-object p3, p0, Lo/cbd$2;->e:Ljava/lang/reflect/Method;

    iput-object p4, p0, Lo/cbd$2;->c:[Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 52
    iget-object v0, p0, Lo/cbd$2;->d:Lo/cbd;

    iget-object v1, p0, Lo/cbd$2;->a:Ljava/lang/Object;

    iget-object v2, p0, Lo/cbd$2;->e:Ljava/lang/reflect/Method;

    iget-object v3, p0, Lo/cbd$2;->c:[Ljava/lang/Object;

    invoke-static {v0, v1, v2, v3}, Lo/cbd;->e(Lo/cbd;Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    return-void
.end method
