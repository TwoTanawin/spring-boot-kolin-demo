```toml
name = 'updateDemoData'
method = 'PUT'
url = 'http://localhost:8082/api/v1/demodata/1'
sortWeight = 3000000
id = '21f8d455-7d2b-4ee2-aac5-e3d799b04102'

[body]
type = 'JSON'
raw = '''
{
  "id": 1,
  "name": "JoJo",
  "email": "JoJo@email.com",
  "phone": "0000000",
  "address": "A75 Bangkok Thailand"
}'''
```
