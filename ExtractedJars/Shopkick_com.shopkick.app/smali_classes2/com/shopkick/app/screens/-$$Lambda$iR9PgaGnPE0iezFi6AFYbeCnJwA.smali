.class public final synthetic Lcom/shopkick/app/screens/-$$Lambda$iR9PgaGnPE0iezFi6AFYbeCnJwA;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic f$0:Lcom/shopkick/app/screens/AppScreen;


# direct methods
.method public synthetic constructor <init>(Lcom/shopkick/app/screens/AppScreen;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/screens/-$$Lambda$iR9PgaGnPE0iezFi6AFYbeCnJwA;->f$0:Lcom/shopkick/app/screens/AppScreen;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/shopkick/app/screens/-$$Lambda$iR9PgaGnPE0iezFi6AFYbeCnJwA;->f$0:Lcom/shopkick/app/screens/AppScreen;

    invoke-virtual {v0}, Lcom/shopkick/app/screens/AppScreen;->logDetectShowPage()V

    return-void
.end method
