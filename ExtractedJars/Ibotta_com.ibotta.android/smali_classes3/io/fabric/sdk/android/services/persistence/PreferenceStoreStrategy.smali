.class public Lio/fabric/sdk/android/services/persistence/PreferenceStoreStrategy;
.super Ljava/lang/Object;
.source "PreferenceStoreStrategy.java"

# interfaces
.implements Lio/fabric/sdk/android/services/persistence/PersistenceStrategy;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lio/fabric/sdk/android/services/persistence/PersistenceStrategy<",
        "TT;>;"
    }
.end annotation


# instance fields
.field private final key:Ljava/lang/String;

.field private final serializer:Lio/fabric/sdk/android/services/persistence/SerializationStrategy;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/fabric/sdk/android/services/persistence/SerializationStrategy<",
            "TT;>;"
        }
    .end annotation
.end field

.field private final store:Lio/fabric/sdk/android/services/persistence/PreferenceStore;


# direct methods
.method public constructor <init>(Lio/fabric/sdk/android/services/persistence/PreferenceStore;Lio/fabric/sdk/android/services/persistence/SerializationStrategy;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/fabric/sdk/android/services/persistence/PreferenceStore;",
            "Lio/fabric/sdk/android/services/persistence/SerializationStrategy<",
            "TT;>;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    iput-object p1, p0, Lio/fabric/sdk/android/services/persistence/PreferenceStoreStrategy;->store:Lio/fabric/sdk/android/services/persistence/PreferenceStore;

    .line 33
    iput-object p2, p0, Lio/fabric/sdk/android/services/persistence/PreferenceStoreStrategy;->serializer:Lio/fabric/sdk/android/services/persistence/SerializationStrategy;

    .line 34
    iput-object p3, p0, Lio/fabric/sdk/android/services/persistence/PreferenceStoreStrategy;->key:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public clear()V
    .locals 2

    .line 52
    iget-object v0, p0, Lio/fabric/sdk/android/services/persistence/PreferenceStoreStrategy;->store:Lio/fabric/sdk/android/services/persistence/PreferenceStore;

    invoke-interface {v0}, Lio/fabric/sdk/android/services/persistence/PreferenceStore;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    iget-object v1, p0, Lio/fabric/sdk/android/services/persistence/PreferenceStoreStrategy;->key:Ljava/lang/String;

    invoke-interface {v0, v1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    return-void
.end method

.method public restore()Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .line 45
    iget-object v0, p0, Lio/fabric/sdk/android/services/persistence/PreferenceStoreStrategy;->store:Lio/fabric/sdk/android/services/persistence/PreferenceStore;

    invoke-interface {v0}, Lio/fabric/sdk/android/services/persistence/PreferenceStore;->get()Landroid/content/SharedPreferences;

    move-result-object v0

    .line 46
    iget-object v1, p0, Lio/fabric/sdk/android/services/persistence/PreferenceStoreStrategy;->serializer:Lio/fabric/sdk/android/services/persistence/SerializationStrategy;

    iget-object v2, p0, Lio/fabric/sdk/android/services/persistence/PreferenceStoreStrategy;->key:Ljava/lang/String;

    const/4 v3, 0x0

    invoke-interface {v0, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0}, Lio/fabric/sdk/android/services/persistence/SerializationStrategy;->deserialize(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public save(Ljava/lang/Object;)V
    .locals 4
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "CommitPrefEdits"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .line 40
    iget-object v0, p0, Lio/fabric/sdk/android/services/persistence/PreferenceStoreStrategy;->store:Lio/fabric/sdk/android/services/persistence/PreferenceStore;

    invoke-interface {v0}, Lio/fabric/sdk/android/services/persistence/PreferenceStore;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    iget-object v2, p0, Lio/fabric/sdk/android/services/persistence/PreferenceStoreStrategy;->key:Ljava/lang/String;

    iget-object v3, p0, Lio/fabric/sdk/android/services/persistence/PreferenceStoreStrategy;->serializer:Lio/fabric/sdk/android/services/persistence/SerializationStrategy;

    invoke-interface {v3, p1}, Lio/fabric/sdk/android/services/persistence/SerializationStrategy;->serialize(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v1, v2, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {v0, p1}, Lio/fabric/sdk/android/services/persistence/PreferenceStore;->save(Landroid/content/SharedPreferences$Editor;)Z

    return-void
.end method
