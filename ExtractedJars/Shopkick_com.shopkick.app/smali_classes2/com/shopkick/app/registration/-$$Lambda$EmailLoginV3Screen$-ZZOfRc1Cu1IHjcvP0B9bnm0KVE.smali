.class public final synthetic Lcom/shopkick/app/registration/-$$Lambda$EmailLoginV3Screen$-ZZOfRc1Cu1IHjcvP0B9bnm0KVE;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic f$0:Lcom/shopkick/app/registration/EmailLoginV3Screen;

.field private final synthetic f$1:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lcom/shopkick/app/registration/EmailLoginV3Screen;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/registration/-$$Lambda$EmailLoginV3Screen$-ZZOfRc1Cu1IHjcvP0B9bnm0KVE;->f$0:Lcom/shopkick/app/registration/EmailLoginV3Screen;

    iput-object p2, p0, Lcom/shopkick/app/registration/-$$Lambda$EmailLoginV3Screen$-ZZOfRc1Cu1IHjcvP0B9bnm0KVE;->f$1:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/shopkick/app/registration/-$$Lambda$EmailLoginV3Screen$-ZZOfRc1Cu1IHjcvP0B9bnm0KVE;->f$0:Lcom/shopkick/app/registration/EmailLoginV3Screen;

    iget-object v1, p0, Lcom/shopkick/app/registration/-$$Lambda$EmailLoginV3Screen$-ZZOfRc1Cu1IHjcvP0B9bnm0KVE;->f$1:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/shopkick/app/registration/EmailLoginV3Screen;->lambda$onScreenDidShow$214(Lcom/shopkick/app/registration/EmailLoginV3Screen;Ljava/lang/String;)V

    return-void
.end method