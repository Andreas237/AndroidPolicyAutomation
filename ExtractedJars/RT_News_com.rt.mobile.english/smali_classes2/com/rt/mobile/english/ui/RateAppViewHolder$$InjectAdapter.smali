.class public final Lcom/rt/mobile/english/ui/RateAppViewHolder$$InjectAdapter;
.super Ldagger/internal/Binding;
.source "RateAppViewHolder$$InjectAdapter.java"

# interfaces
.implements Ldagger/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ldagger/internal/Binding<",
        "Lcom/rt/mobile/english/ui/RateAppViewHolder;",
        ">;",
        "Ldagger/MembersInjector<",
        "Lcom/rt/mobile/english/ui/RateAppViewHolder;",
        ">;"
    }
.end annotation


# instance fields
.field private appEventCounter:Ldagger/internal/Binding;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Binding<",
            "Lcom/rt/mobile/english/data/AppEventCounter;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 4

    const-string v0, "members/com.rt.mobile.english.ui.RateAppViewHolder"

    .line 27
    const-class v1, Lcom/rt/mobile/english/ui/RateAppViewHolder;

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {p0, v2, v0, v3, v1}, Ldagger/internal/Binding;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public attach(Ldagger/internal/Linker;)V
    .locals 3

    const-string v0, "com.rt.mobile.english.data.AppEventCounter"

    .line 37
    const-class v1, Lcom/rt/mobile/english/ui/RateAppViewHolder;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v2

    invoke-virtual {p1, v0, v1, v2}, Ldagger/internal/Linker;->requestBinding(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/ClassLoader;)Ldagger/internal/Binding;

    move-result-object p1

    iput-object p1, p0, Lcom/rt/mobile/english/ui/RateAppViewHolder$$InjectAdapter;->appEventCounter:Ldagger/internal/Binding;

    return-void
.end method

.method public getDependencies(Ljava/util/Set;Ljava/util/Set;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ldagger/internal/Binding<",
            "*>;>;",
            "Ljava/util/Set<",
            "Ldagger/internal/Binding<",
            "*>;>;)V"
        }
    .end annotation

    .line 46
    iget-object p1, p0, Lcom/rt/mobile/english/ui/RateAppViewHolder$$InjectAdapter;->appEventCounter:Ldagger/internal/Binding;

    invoke-interface {p2, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public injectMembers(Lcom/rt/mobile/english/ui/RateAppViewHolder;)V
    .locals 1

    .line 55
    iget-object v0, p0, Lcom/rt/mobile/english/ui/RateAppViewHolder$$InjectAdapter;->appEventCounter:Ldagger/internal/Binding;

    invoke-virtual {v0}, Ldagger/internal/Binding;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/rt/mobile/english/data/AppEventCounter;

    iput-object v0, p1, Lcom/rt/mobile/english/ui/RateAppViewHolder;->appEventCounter:Lcom/rt/mobile/english/data/AppEventCounter;

    return-void
.end method

.method public bridge synthetic injectMembers(Ljava/lang/Object;)V
    .locals 0

    .line 22
    check-cast p1, Lcom/rt/mobile/english/ui/RateAppViewHolder;

    invoke-virtual {p0, p1}, Lcom/rt/mobile/english/ui/RateAppViewHolder$$InjectAdapter;->injectMembers(Lcom/rt/mobile/english/ui/RateAppViewHolder;)V

    return-void
.end method
