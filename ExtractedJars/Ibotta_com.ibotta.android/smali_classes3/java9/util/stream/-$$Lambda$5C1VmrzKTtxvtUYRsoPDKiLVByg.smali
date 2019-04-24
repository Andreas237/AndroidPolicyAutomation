.class public final synthetic Ljava9/util/stream/-$$Lambda$5C1VmrzKTtxvtUYRsoPDKiLVByg;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic f$0:Ljava9/util/stream/BaseStream;


# direct methods
.method public synthetic constructor <init>(Ljava9/util/stream/BaseStream;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljava9/util/stream/-$$Lambda$5C1VmrzKTtxvtUYRsoPDKiLVByg;->f$0:Ljava9/util/stream/BaseStream;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Ljava9/util/stream/-$$Lambda$5C1VmrzKTtxvtUYRsoPDKiLVByg;->f$0:Ljava9/util/stream/BaseStream;

    invoke-interface {v0}, Ljava9/util/stream/BaseStream;->close()V

    return-void
.end method
