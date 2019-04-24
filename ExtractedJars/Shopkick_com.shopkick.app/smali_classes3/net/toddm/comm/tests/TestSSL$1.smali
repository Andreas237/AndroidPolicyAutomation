.class Lnet/toddm/comm/tests/TestSSL$1;
.super Ljava/util/HashMap;
.source "TestSSL.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnet/toddm/comm/tests/TestSSL;->testBadCert()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/HashMap<",
        "Ljava/lang/String;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = 0x7dc8b1ad8a09a4feL


# instance fields
.field final synthetic this$0:Lnet/toddm/comm/tests/TestSSL;


# direct methods
.method constructor <init>(Lnet/toddm/comm/tests/TestSSL;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lnet/toddm/comm/tests/TestSSL$1;->this$0:Lnet/toddm/comm/tests/TestSSL;

    .line 52
    invoke-direct {p0}, Ljava/util/HashMap;-><init>()V

    const-string p1, "disable_ssl_cert_checking"

    const/4 v0, 0x1

    .line 55
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lnet/toddm/comm/tests/TestSSL$1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
